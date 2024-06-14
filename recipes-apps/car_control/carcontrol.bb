SUMMARY = "Can Control Service"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/DES-Team-02/car_control.git;protocol=https;branch=dev"
SRCREV = "4017db22f0a0e56713996475a1502689d07834ae"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
           boost \
"
RDEPENDS:${PN} += "cantransceiver"

FILES:${PN} += "${libdir}/piracer/CarControl/*"
FILES:${PN} += "${libdir}/*.so"
FILES:${PN}-dev += "${libdir}/*.so"

do_install:append() {
    # Ensure the directory exists
    install -d ${D}${libdir}

    # Create the symbolic link for libCarControl-someip.so
    if [ -e "${D}${libdir}/libCarControl-someip.so.0.1" ]; then
        ln -sf libCarControl-someip.so.0.1 ${D}${libdir}/libCarControl-someip.so
    fi

    # Create the symbolic link for libJetson-someip.so
    if [ -e "${D}${libdir}/libJetson-someip.so" ]; then
        mv ${D}${libdir}/libJetson-someip.so ${D}${libdir}/libJetson-someip.so.1.0
        ln -sf libJetson-someip.so.1.0 ${D}${libdir}/libJetson-someip.so
    fi

    # Create the symbolic link for libCanTransceiver-someip.so
    #if [ -e "${D}${libdir}/libCanTransceiver-someip.so" ]; then
    #    mv ${D}${libdir}/libCanTransceiver-someip.so ${D}${libdir}/libCanTransceiver-someip.so.1.0
    #    ln -sf libCanTransceiver-someip.so.1.0 ${D}${libdir}/libCanTransceiver-someip.so
    #fi
}

