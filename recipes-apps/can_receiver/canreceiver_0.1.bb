SUMMARY = "Can Receiver"
SECTION = "apps"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fba3b94d88bfb9b81369b869a1e9a20f"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/SeungWoo-L/can_receiver.git;protocol=https;branch=main"
SRCREV = "486e45ce3d367da0d94d275969483976dad4aefc"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
"
  
