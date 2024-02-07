DESCRIPTION = "Flutter Dashboard Application"
LICENSE = "CLOSED"

SRC_URI = "file://dashboard.desktop"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/xdg/autostart
    install -m 0644 ${WORKDIR}/dashboard.desktop ${D}${sysconfdir}/xdg/autostart/dashboard.desktop
}

FILES:${PN} += "${sysconfdir}/xdg/autostart/dashboard.desktop"
