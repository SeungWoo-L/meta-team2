DESCRIPTION = "TouchScreen Setting init Script"
LICENSE = "CLOSED"

SRC_URI = "file://touchscreen.sh"

S = "${WORKDIR}"

RDEPENDS:${PN} =+ "bash"

do_install() {
    install -d ${D}${sysconfdir}/profile.d
    install -m 0755 ${WORKDIR}/touchscreen.sh ${D}${sysconfdir}/profile.d/touchscreen.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/touchscreen.sh"