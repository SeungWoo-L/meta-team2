SUMMARY = "Can Transceiver"
SECTION = "apps"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/DES-Team-02/DES_4_CanTransceiver.git;protocol=https;branch=dev"
SRCREV = "1aa35a740981376c9d5e9512abf414099b61cff1"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS = " \
           common-api-c++ \
           vsomeip \
           common-api-c++-someip \
           python3 \
"

