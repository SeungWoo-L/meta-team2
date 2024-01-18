SUMMARY = "Can Info Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/SeungWoo-L/car_info.git;protocol=https;branch=main"
SRCREV = "da0b97775de8f30a2027f6ac53210155f7369b62"

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
