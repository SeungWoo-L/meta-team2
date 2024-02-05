SUMMARY = "Flutter Dashboard Application"
DESCRIPTION = "Flutter Dashboard Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Dashboard"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Dashboard/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "4b779d9aff6a3f11160e5c37b0af3339201caf03"
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
