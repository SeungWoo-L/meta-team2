
# meta-team2 Layer Documentation

## Overview
This README file contains information on the contents of the meta-team2 layer for OpenEmbedded and Yocto Project.

## Table of Contents
1. [Dependencies](#dependencies)
2. [Patches](#patches)
3. [Adding the meta-team2 layer to your build](#adding-the-meta-team2-layer-to-your-build)
4. [Miscellaneous](#miscellaneous)
5. [Raspberry Pi Project Setup Guide](#raspberry-pi-project-setup-guide)

## Dependencies
Dependencies for the meta-team2 layer:

```
  URI: <first dependency>
  branch: <branch name>

  URI: <second dependency>
  branch: <branch name>

  ...
```

## Patches
Submit patches for the meta-team2 layer:

- Mailing List: xxxx@zzzz.org
- CC: Maintainer - XXX YYYYYY <xxx.yyyyyy@zzzzz.com>

## Adding the meta-team2 layer to your build
To add the meta-team2 layer to your build, run:

```
bitbake-layers add-layer meta-team2
```

## Miscellaneous
Additional information and steps for managing the meta-team2 layer.

## Raspberry Pi Project Setup Guide
This guide provides instructions for setting up a Raspberry Pi project environment.

### Prerequisites
Tools and frameworks required:

- Meta Raspberry Pi
- Clang
- Flutter
- OpenEmbedded

### Installation Steps
1. Install Meta Raspberry Pi
2. Install Clang
3. Install Flutter
4. Install OpenEmbedded

'''
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
'''

### Configuring BitBake Environment
Go to /poky
'source oe-init-build-env'
= You should run this cmd everytime when you do bitbake
### Managing Layers
Instructions for adding and removing layers.

- Add a Layer: `bitbake-layers add-layer [path/to/your/layer]`
- Remove a Layer: `bitbake-layers remove-layer [layer-name]`

### Adding Features in Recipes
Steps to add new features in recipes.

1. Find recipes on [OpenEmbedded Layer Index](https://layers.openembedded.org/layerindex/branch/master/recipes/).
2. Check and match all dependencies.
3. Find recipes in layers downloaded in prerequisites.
4. Modify `recipes-core/images/team2-rpi-image.bbappend`.
5. Run `bitbake` and pray.
