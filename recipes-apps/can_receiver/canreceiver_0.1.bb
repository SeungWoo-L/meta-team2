SUMMARY = "Can Receiver"
SECTION = "apps"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fba3b94d88bfb9b81369b869a1e9a20f"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/SeungWoo-L/can_receiver.git;protocol=https;branch=main"
SRCREV = "c0b10bd5e9c880d96366d253118c04b16b4c9042"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
"
  
