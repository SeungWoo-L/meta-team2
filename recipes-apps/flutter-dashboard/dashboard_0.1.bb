SUMMARY = "Flutter Dashboard Application"
DESCRIPTION = "Flutter Dashboard Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/Lagavulin9/Flutter_Dashboard"
BUGTRACKER = "https://github.com/Lagavulin9/Flutter_Dashboard/issues"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "b659c79ff4e44e5e490a7f2f818bcb3794d1c6cc"
SRC_URI = "git://github.com/Lagavulin9/Flutter_Dashboard.git;protocol=https;branch=main"

DEPENDS += "\
    flutter-sdk-native \
"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_dashboard"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"

inherit flutter-app