DESCRIPTION = "Flutter window Setting init Script"
LICENSE = "CLOSED"

SRC_URI = "file://windowinit.sh \
           file://windowinit.desktop"

S = "${WORKDIR}"

RDEPENDS:${PN} += "bash xdotool"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/windowinit.sh ${D}${bindir}
    
    install -d ${D}${sysconfdir}/xdg/autostart
    install -m 0755 ${WORKDIR}/windowinit.desktop ${D}${sysconfdir}/xdg/autostart
}

FILES:${PN} += "${bindir}/windowinit.sh \
                ${sysconfdir}/xdg/autostart/windowinit.desktop"
