SUMMARY = "Flutter Dashboard Application"
DESCRIPTION = "Flutter Dashboard Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Dashboard"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Dashboard/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "52ef2934a7ad02f8f5524ecdd2991e585ecdd3f1"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Dashboard.git;protocol=https;branch=bundle"

S = "${WORKDIR}/git"

FILES:${PN} += "\
    ${datadir}/flutter/flutter-app/Dashboard/* \
    ${datadir}/flutter/flutter-app/Dashboard/*/* \
    ${datadir}/flutter/flutter-app/Dashboard/*/*/* \
    ${datadir}/flutter/flutter-app/Dashboard/*/*/*/* \
    ${datadir}/flutter/flutter-app/Dashboard/*/*/*/*/* \
"

do_install(){
    install -d ${D}${datadir}/flutter/flutter-app/Dashboard/
    cp -r ${S}/bundle/* ${D}${datadir}/flutter/flutter-app/Dashboard/

}

INSANE_SKIP:${PN} += "file-rdeps ldflags"
