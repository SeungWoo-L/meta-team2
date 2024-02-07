SUMMARY = "Can Control Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/kianwasabi/car_control.git;protocol=https;branch=main"
SRCREV = "54c4726b263c4469dba16807d6007e2aa053e9f0"

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
