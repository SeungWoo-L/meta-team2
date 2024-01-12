SUMMARY = "Can Info Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/SeungWoo-L/car_info.git;protocol=https;branch=patch-1"
SRCREV = "39a646b92a0d481622510050e1112aebbd37e4c1"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
           boost \
"

FILES:${PN}-dev += "${libdir}/piracer/CarInfo"  
