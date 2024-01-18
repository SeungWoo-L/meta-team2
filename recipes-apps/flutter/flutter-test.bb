DESCRIPTION = "Flutter Sample App"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/flutter/samples.git;protocol=https;branch=main"
SRCREV = "7db3d8c71adf374e613a2c045b9646cd43856621"

S = "${WORKDIR}/git/animations"

inherit flutter-app
