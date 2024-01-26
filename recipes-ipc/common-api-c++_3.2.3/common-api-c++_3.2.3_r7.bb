SUMMARY = "CommonAPI"
SECTION = "libs"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

PROVIDES = "commonapi3"
PR = "r7"

DEPENDS = "dlt-daemon"

inherit cmake lib_package pkgconfig

SRCREV = "e3818cb0ad5b9c734cca361edccb16ca93081728"
SRC_URI = "git://github.com/GENIVI/capicxx-core-runtime.git;protocol=https;nobranch=1"
SRC_URI += "file://commonapi.ini"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=/usr \
    -DINSTALL_LIB_DIR:PATH=${baselib} \
    -DINSTALL_CMAKE_DIR:PATH=${baselib}/cmake/CommonAPI \
    "

FILES_${PN} += "${libdir}/cmake"
FILES_${PN} += "${includedir}/CommonAPI-3.2"
FILES_${PN}-dev += "${libdir}/cmake"

do_install:append(){
    install -d ${D}/etc
    install -m0644 ${WORKDIR}/commonapi.ini ${D}/etc/
}

BBCLASSEXTEND = "nativesdk"

