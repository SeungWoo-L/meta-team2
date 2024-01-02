do_install:append() {
    sed -i 's/3f204000/fe204000/g' ${D}${sysconfdir}/udev/rules.d/can.rules
}

