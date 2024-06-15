SUMMARY = "Custom network setup"
LICENSE = "CLOSED"

SRC_URI = "file://network-setup.service \
           file://network-setup.sh"

FILES_${PN} += "/etc/systemd/system/network-setup.service"
FILES_${PN} += "/usr/bin/network-setup.sh"

do_install() {
    install -d ${D}/etc/systemd/system
    install -m 0644 ${WORKDIR}/network-setup.service ${D}/etc/systemd/system/
    install -d ${D}/usr/bin
    install -m 0755 ${WORKDIR}/network-setup.sh ${D}/usr/bin/
}
