EXTRA_OECONF += "--enable-libmpv-shared"

FILES:${PN}-dev += "\
    ${libdir}/libmpv*.so \
    ${includedir}/mpv \
"

FILES:${PN} += "\
    ${libdir}/libmpv.so.* \
"