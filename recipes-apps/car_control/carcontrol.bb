SUMMARY = "Can Control Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/kianwasabi/car_control.git;protocol=https;branch=main"
SRCREV = "cd0b3dbdf613f1bb2efd66d044213c534acf30b7"

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
