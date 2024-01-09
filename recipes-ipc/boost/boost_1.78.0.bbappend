FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"


DEPENDS += " python3-numpy"
PACKAGES += " boost-numpy"

FILES:${PN}-numpy = "${libdir}/libboost_numpy*.so.*"
