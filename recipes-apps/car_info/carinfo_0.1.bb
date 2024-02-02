SUMMARY = "Can Info Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/SeungWoo-L/car_info.git;protocol=https;branch=main"
SRCREV = "513b3594b7b930639c668e99d45296890f0b4666"

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
