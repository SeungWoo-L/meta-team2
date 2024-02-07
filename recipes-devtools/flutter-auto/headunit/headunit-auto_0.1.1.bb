DESCRIPTION = "Flutter Head-Unit Application"
LICENSE = "CLOSED"

SRC_URI = "file://headunit.desktop"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/xdg/autostart
    install -m 0644 ${WORKDIR}/headunit.desktop ${D}${sysconfdir}/xdg/autostart/headunit.desktop
}

FILES:${PN} += "${sysconfdir}/xdg/autostart/headunit.desktop"
