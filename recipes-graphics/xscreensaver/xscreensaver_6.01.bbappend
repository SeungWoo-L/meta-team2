FILES:${PN}:remove = "${datadir}/X11/app-defaults/XScreenSaver ${datadir}/fonts"
SYSTEMD_SERVICE:${PN}:remove = "xscreensaver.service"
FILES:${PN}-perl:remove = "\
    ${libexecdir}/${PN}/xscreensaver-getimage-file \
    ${libexecdir}/${PN}/xscreensaver-getimage-video \
    ${libexecdir}/${PN}/webcollage \
    ${libexecdir}/${PN}/xscreensaver-text \
    ${libexecdir}/${PN}/vidwhacker \
    "