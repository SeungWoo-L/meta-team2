SUMMARY = "Set supervisor for process management"

LICENSE = "CLOSED"

SRC_URI = "file://configs.d"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/supervisor/conf.d
    install -m 0644 ${S}/configs.d/canreceiver.conf ${D}${sysconfdir}/supervisor/conf.d/
    install -m 0644 ${S}/configs.d/carcontrol.conf ${D}${sysconfdir}/supervisor/conf.d/
    install -m 0644 ${S}/configs.d/carinfo.conf ${D}${sysconfdir}/supervisor/conf.d/ 
}
 
