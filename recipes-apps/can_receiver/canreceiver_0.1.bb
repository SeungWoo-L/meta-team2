SUMMARY = "Can Receiver"
SECTION = "apps"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=fba3b94d88bfb9b81369b869a1e9a20f"

SRC_URI = "git://github.com/SeungWoo-L/can_receiver.git;protocol=https;branch=dev"
SRCREV = "7097d815d79532769328cb7a7ea0e0458628dad4"

S = "${WORKDIR}/git/can_receiver"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
"

EXTRA_OECMAKE += " \
                -DCMAKE_INCLUDE_PATH=${STAGING_INCDIR} \
                -DCMAKE_LIBRARY_PATH=${STAGING_LIBDIR} \
"

do_install:append() {
    cp -r ${S}/can-setup.sh ${D}${bindir}/
}
