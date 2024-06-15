FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://can1.rules"

do_install:append() {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/can1.rules ${D}${sysconfdir}/udev/rules.d/
    sed -i 's/3f204000/fe204000/g' ${D}${sysconfdir}/udev/rules.d/can.rules
}

