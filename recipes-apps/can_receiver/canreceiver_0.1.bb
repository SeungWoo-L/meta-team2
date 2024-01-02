SUMMARY = "Can Receiver"
SECTION = "apps"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fba3b94d88bfb9b81369b869a1e9a20f"

SRC_URI = "git://github.com/SeungWoo-L/can_receiver/releases/tag/0.1;protocol=https;branch=main;tag=0.1"
#SRCREV = "594a8e7f479b29230bc7a382da5dc1b63772d865"

S = "${WORKDIR}/can_receiver/git"

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
