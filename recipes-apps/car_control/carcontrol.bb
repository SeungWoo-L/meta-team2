SUMMARY = "Can Control Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/kianwasabi/car_control.git;protocol=https;branch=main"
SRCREV = "82f7c359a6914263c49b23bfad9d4dfda749ca48"

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
