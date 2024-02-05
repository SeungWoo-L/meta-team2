SUMMARY = "Flutter Headunit Application"
DESCRIPTION = "Flutter Headunit Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Head-Unit"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Head-Unit/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "bbb9a9157847b43ee4f9b803d84dc2d84af87994"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Head-Unit.git;protocol=https;branch=bundle"

S = "${WORKDIR}/git"

FILES:${PN} += "\
    ${datadir}/flutter/flutter-app/Headunit/* \
    ${datadir}/flutter/flutter-app/Headunit/*/* \
    ${datadir}/flutter/flutter-app/Headunit/*/*/* \
    ${datadir}/flutter/flutter-app/Headunit/*/*/*/* \
    ${datadir}/flutter/flutter-app/Headunit/*/*/*/*/* \
"

do_install(){
    install -d ${D}${datadir}/flutter/flutter-app/Headunit/
    cp -r ${S}/bundle/* ${D}${datadir}/flutter/flutter-app/Headunit/

}

INSANE_SKIP:${PN} += "file-rdeps ldflags"
