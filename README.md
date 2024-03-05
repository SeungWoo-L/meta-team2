
# meta-team2 Layer Documentation

## Overview
This README file contains information on the contents of the meta-team2 layer for OpenEmbedded and Yocto Project. This layer aims to install install applications of [DES_Head-Unit](https://github.com/Lagavulin9/DES_3_Head-Unit) and it's dependencies on custom linux image named `team2-rpi-image`. This image will use `systemd` as init system and `X11` as display server.

## Table of Contents
1. [Dependencies](#dependencies)
2. [Prerequisites](#prerequisites)
3. [Build](#build)
4. [Recipes](#recipes)
5. [References](#references)


## Dependencies
Dependencies for the meta-team2 layer:
- [meta-raspberrypi](https://github.com/agherzan/meta-raspberrypi)
- [meta-clang](https://github.com/kraj/meta-clang)
- [meta-flutter](https://github.com/meta-flutter/meta-flutter)
- [meta-openembedded](https://github.com/openembedded/meta-openembedded)

## Prerequisites
### Configuring BitBake Environment

Go to your poky repository, then run this commond
```
source oe-init-build-env
```
You should run this command before running bitbake

### Set `local.conf` and `layer.conf`
After running the command above, next step is to edit conf files in `conf` directory.
- Add these lines in `conf/local.conf` file.
  ```
  MACHINE = "raspberrypi4-64"
  DISTRO_FEATURES_append = " x11 systemd"
  INIT_MANAGER = "systemd"
  DISTRO_FEATURES_BACKFILL_CONSIDERED += "sysvinit"
  ```

And also edit `conf/layer.conf` file.
- Add these lines `conf/layer.conf` file.
  ```
  # We have a conf and classes directory, add to BBPATH
  BBPATH .= ":${LAYERDIR}"

  # We have recipes-* directories, add to BBFILES
  BBFILES += "${LAYERDIR}/recipes-*/*/*.bb \
              ${LAYERDIR}/recipes-*/*/*.bbappend \
              ${LAYERDIR}/recipes-*/*/*/*.bb \
  "

  BBFILE_COLLECTIONS += "team2"
  BBFILE_PATTERN_team2 = "^${LAYERDIR}/"
  BBFILE_PRIORITY_team2 = "10"

  LAYERDEPENDS_meta-env = "core"
  LAYERSERIES_COMPAT_meta-env = "kirkstone"

  LICENSE_FLAGS_ACCEPTED += "commercial"
  ```

### Change meta-raspberrypi conf

You have to use meta-raspberrypi master branch but change this line in meta-raspberrypi .conf/layer.conf

```
LAYERSERIES_COMPAT_raspberrypi = "kirkstone"
```

### Error and Solution Guide

> **WARNING**:
```bash
ERROR: No recipes in default available for:
/home/seame02/poky/meta-raspberrypi/dynamic-layers/multimedia-layer/recipes-multimedia/libcamera/libcamera_%.bbappend
```
<b>Solution
If you see this error while you are executing a bitbake command, it indicates an issue with the <code>libcamera_%.bbappend</code> file. To resolve this, please follow the steps below:

1. Navigate to the directory containing the problematic file:
   ```bash
   cd /home/seame02/poky/meta-raspberrypi/dynamic-layers/multimedia-layer/recipes-multimedia/libcamera/
   ```
2. Delete the `libcamera_%.bbappend` file:
   ```bash
   rm libcamera_%.bbappend
   ```
   
This action should resolve the error, allowing your bitbake process to continue without issues.



### Managing Layers
Instructions for adding and removing layers.

- Add a Layer: `bitbake-layers add-layer [path/to/your/layer]`
- Remove a Layer: `bitbake-layers remove-layer [layer-name]`

### Adding the meta-team2 layer to your build
To add the meta-team2 layer to your build, run:
```
bitbake-layers add-layer meta-raspberrypi
bitbake-layers add-layer meta-clang
bitbake-layers add-layer meta-flutter
bitbake-layers add-layer meta-openembedded/meta-oe
bitbake-layers add-layer meta-openembedded/meta-pytho
bitbake-layers add-layer meta-openembedded/meta-multimedia
bitbake-layers add-layer meta-openembedded/meta-networking
```
finally
```
bitbake-layers add-layer meta-team2
```

or edit `conf/layer.conf` manually
```
BBLAYERS ?= " \
  /home/seame02/poky_src/poky/meta \
  /home/seame02/poky_src/poky/meta-poky \
  /home/seame02/poky_src/poky/meta-yocto-bsp \
  /home/seame02/poky_src/poky/meta-raspberrypi \
  /home/seame02/poky_src/poky/meta-clang \
  /home/seame02/poky_src/poky/meta-flutter \
  /home/seame02/poky_src/poky/meta-openembedded/meta-oe \
  /home/seame02/poky_src/poky/meta-openembedded/meta-python \
  /home/seame02/poky_src/poky/meta-openembedded/meta-multimedia \
  /home/seame02/poky_src/poky/meta-openembedded/meta-networking \
  /home/seame02/poky_src/poky/meta-team2 \
  "
```

## Build
### Add features and build
Steps to add new features in recipes.

1. Find recipes in [OpenEmbedded Layer Index](https://layers.openembedded.org/layerindex/branch/master/recipes/).
2. Check and match all dependencies.
3. Find recipes in layers downloaded in prerequisites.
4. Modify `recipes-core/images/team2-rpi-image.bbappend`.
5. Run `bitbake team2-rpi-image` and pray 🙏🙏🙏

### Flash
By default the product of build process, `team2-rpi-image`, is located in `/tmp/deploy/images/~`. Use `dd` command on your terminal or [Balena Etcher](https://etcher.balena.io/) to select your media device and flash the image.


## Recipes
- ### recipes-app
  These recipes will install applications that are needed to implement requirements for [DES_Head-Unit](https://github.com/Lagavulin9/DES_3_Head-Unit)
- ### recipes-bsp
  To use USB as boot media instead of SD card, boot command line is modified in these recipes.
- ### recipes-env
  Raspberry Pi configurations are in these recipes. It is possible to modify Raspberry Pi's dtoverlays and overall configurations by editting `rpi-config` recipe just like editting `/boot/config.txt` in Raspbian OS.
- ### recipes-graphics
  Display related features are in these recipes. `team2-rpi-image` use X11 as display server and xfce window manager to display two different screen on each screen.
- ### recipes-ipc
  Provides vSomeIP/CommonAPI related libraries to the system.
- #### recipes-piracer
  Provides python libraries to utilize Raspberry Pi's hardware.

## References
- [Yocto Project](https://docs.yoctoproject.org/index.html)
- [X Window System](https://en.wikipedia.org/wiki/X_Window_System)
- [Systemd](https://en.wikipedia.org/wiki/Systemd)
- [udev](https://ko.wikipedia.org/wiki/Udev)
- [Raspberry Pi Firmware Overlays](https://github.com/raspberrypi/firmware/blob/master/boot/overlays/README)
- [Boot image for USB](https://github.com/agherzan/meta-raspberrypi/issues/864#issuecomment-1535687655)
