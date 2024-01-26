SUMMARY = "Flutter HeadUnit Application"
DESCRIPTION = "Flutter HeadUnit Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Head-Unit"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Head-Unit/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "eb096e886747675cdc30d2282dbcd6e3e9450b68"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Head-Unit.git;protocol=https;branch=dev-figma"

DEPENDS += "\
    flutter-sdk-native \
    mpv \
"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_head_unit"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"

inherit flutter-app