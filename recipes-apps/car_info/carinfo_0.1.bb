SUMMARY = "Can Info Service"
SECTION = "apps"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fba3b94d88bfb9b81369b869a1e9a20f"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/SeungWoo-L/car_info.git;protocol=https;branch=swlee"
SRCREV = "5b33897598c1d6f32310eb01f4912b2e8bfd0c43"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
           boost \
"
  
