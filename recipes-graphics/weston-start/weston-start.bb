DESCRIPTION = "Weston Start Script"
LICENSE = "CLOSED"

SRC_URI = "file://start-weston.sh"

S = "${WORKDIR}"

RDEPENDS:${PN} =+ "bash"

do_install() {
    install -d ${D}${sysconfdir}/profile.d
    install -m 0755 ${WORKDIR}/start-weston.sh ${D}${sysconfdir}/profile.d/start-weston.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/start-weston.sh"
