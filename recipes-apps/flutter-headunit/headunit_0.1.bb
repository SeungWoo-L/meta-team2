SUMMARY = "Flutter Headunit Application"
DESCRIPTION = "Flutter Headunit Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Head-Unit"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Head-Unit/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "0fd67653e281a6c222998151da75b5cdbdeada48"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Head-Unit.git;protocol=https;branch=bundle"

S = "${WORKDIR}/git"

FILES:${PN} += "\
    ${datadir}/flutter/flutter-app/Headunit/* \
    ${datadir}/flutter/flutter-app/Headunit/*/* \
    ${datadir}/flutter/flutter-app/Headunit/*/*/* \
    ${datadir}/flutter/flutter-app/Headunit/*/*/*/* \
    ${datadir}/flutter/flutter-app/Headunit/*/*/*/*/* \
    ${libdir}/libHeadUnit-someip.so \
"
FILES:${PN}-dev += "\
    ${libdir}/libHeadUnit-someip.so \
" 

do_install(){
    install -d ${D}${datadir}/flutter/flutter-app/Headunit/
    cp -r ${S}/bundle/* ${D}${datadir}/flutter/flutter-app/Headunit/
    install -d ${D}${libdir}/
    cp ${S}/bundle/lib/libHeadUnit-someip.so ${D}${libdir}/

}

INSANE_SKIP:${PN} += "file-rdeps ldflags"
INSANE_SKIP:${PN}-dev += "file-rdeps dev-elf"
