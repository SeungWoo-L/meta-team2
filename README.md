
# meta-team2 Layer Documentation

## Overview
This README file contains information on the contents of the meta-team2 layer for OpenEmbedded and Yocto Project.

## Table of Contents
1. [Dependencies](#dependencies)
2. [Adding the meta-team2 layer to your build](#adding-the-meta-team2-layer-to-your-build)
3. [Prerequisites](#prerequisites)
4. [Installation Steps](#installation-steps)
5. [Configuring BitBake Environment](#configuring-bitbake-environment)
6. [Managing Layers](#managing-layers)
7. [Adding Features in Recipes](#adding-features-in-recipes)

## Dependencies
Dependencies for the meta-team2 layer:

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

## Adding the meta-team2 layer to your build
To add the meta-team2 layer to your build, run:

```
bitbake-layers add-layer meta-team2
```

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

### Configuring BitBake Environment

Go to /poky
```
source oe-init-build-env
```
You should run this cmd everytime when you do bitbake

### Managing Layers
Instructions for adding and removing layers.

- Add a Layer: `bitbake-layers add-layer [path/to/your/layer]`
- Remove a Layer: `bitbake-layers remove-layer [layer-name]`

### Adding Features in Recipes
Steps to add new features in recipes.

1. Find recipes in [OpenEmbedded Layer Index](https://layers.openembedded.org/layerindex/branch/master/recipes/).
2. Check and match all dependencies.
3. Find recipes in layers downloaded in prerequisites.
4. Modify `recipes-core/images/team2-rpi-image.bbappend`.
5. Run `bitbake` and pray.
