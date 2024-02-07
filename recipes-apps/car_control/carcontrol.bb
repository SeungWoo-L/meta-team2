SUMMARY = "Can Control Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/kianwasabi/car_control.git;protocol=https;branch=main"
SRCREV = "9e4cd38a4848e9a7021a0f6f057019201b24e0cd"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
           boost \
"


FILES:${PN}-dev += "${libdir}/piracer/CarControl"
