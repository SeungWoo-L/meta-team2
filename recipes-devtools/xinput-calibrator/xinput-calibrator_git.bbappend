DESCRIPTION = "Custom XFCE initialization and configuration tweaks"
LICENSE = "CLOSED"


do_install:append() {
    rm -f ${D}${sysconfdir}/xdg/autostart/xinput_calibrator.desktop
    rm -f ${D}${bindir}/xinput_calibrator_once.sh
    rm -f ${D}${sysconfdir}/X11/Xsession.d/30xinput_calibrate.sh
}

FILES:${PN}:remove = "${sysconfdir}/xdg/autostart/xinput_calibrator.desktop"
FILES:${PN}:remove = "${bindir}/xinput_calibrator_once.sh"
FILES:${PN}:remove = "${sysconfdir}/X11/Xsession.d/30xinput_calibrate.sh"
