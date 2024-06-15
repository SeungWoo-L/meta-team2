SUMMARY = "the implementation of SOME/IP"
SECTION = "base"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

DEPENDS = "boost dlt-daemon"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRCREV = "02c199dff8aba814beebe3ca417fd991058fe90c"
SRC_URI = " \
	git://github.com/GENIVI/${BPN}.git;protocol=https;nobranch=1; \
    file://vsomeip.json \
"

S = "${WORKDIR}/git"

inherit cmake lib_package gitpkgv

PACKAGES:remove = "${PN}-bin"
FILES_${PN} += "${bindir}/vsomeipd ${sysconfdir}/${BPN}"
FILES_${PN}-dev += "${libdir}/cmake"

BBCLASSEXTEND = "nativesdk"

do_configure:prepend(){
	export GTEST_ROOT="n/a"
}

do_install:append() {
    mv ${D}/usr/etc ${D}
    rm -rf ${D}/etc/vsomeip/*

    install -m 0644 ${WORKDIR}/vsomeip.json ${D}/etc/vsomeip/vsomeip.json
}

