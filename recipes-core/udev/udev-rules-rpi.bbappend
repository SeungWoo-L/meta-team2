FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://../../../../meta-team2/recipes-core/udev/files/can1.rules"

do_install:append() {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/../../../../meta-team2/recipes-core/udev/files/can1.rules ${D}${sysconfdir}/udev/rules.d/
    sed -i 's/3f204000/fe204000/g' ${D}${sysconfdir}/udev/rules.d/can.rules
}

