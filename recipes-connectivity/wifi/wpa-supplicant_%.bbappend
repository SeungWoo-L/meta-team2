FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://wpa_supplicant-nl80211-wlan0.conf"

# SYSTEMD_SERVICE:${PN}:append = " wpa_supplicant-nl80211@wlan0.service"

do_install:append () {
    install -d ${D}${sysconfdir}/wpa_supplicant/
    
    install -D -m 600 ${WORKDIR}/wpa_supplicant-nl80211-wlan0.conf \
        ${D}${sysconfdir}/wpa_supplicant/wpa_supplicant-nl80211-wlan0.conf
    
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/

    if [ -L ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant-nl80211@wlan0.service ]; then
        rm -f ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant-nl80211@wlan0.service
    fi

    ln -s ${systemd_unitdir}/system/wpa_supplicant-nl80211@.service \
        ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant-nl80211@wlan0.service
}
