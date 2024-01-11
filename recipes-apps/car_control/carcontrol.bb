SUMMARY = "Can Control Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/kianwasabi/car_control.git;protocol=https;branch=main"
SRCREV = "ca500ca5eb4a49d78639f1fe2908139e8e20dcb7"

S = "${WORKDIR}/git"

inherit cmake lib_package pkgconfig

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
           boost \
"

FILES_${PN} += "${libdir}/CarControl/gamepad.py \
		${libdir}/CarControl/vehicles.py"

FILES_${PN}-dev += "${libdir}/piracer/CarControl"
