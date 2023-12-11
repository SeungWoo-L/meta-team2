#ENABLE_I2C
ENABLE_I2C = "1"

do_deploy:append() {
    echo "# Turn on spi">> $CONFIG
    echo "dtparam=spi=on" >> $CONFIG
    
    echo "# Setting for 2-CH FD CAN Hat" >> $CONFIG
    echo "dtoverlay=spil-3cs" >> $CONFIG
    echo "dtoverlay=mcp251xfd,spi0-0,interrupt=25" >> $CONFIG
    echo "dtoverlay=mcp251xfd,spi1-0,interrupt=24" >> $CONFIG
    
    echo "# Setting for 7Inch HDMI LCD(H)" >> $CONFIG
    echo "hdmi_force_hotpulg=1" >> $CONFIG
    echo "config_hdmi_boost=10" >> $CONFIG
    echo "hdmi_group=2" >> $CONFIG
    echo "hdmi_mode=87" >> $CONFIG
    echo "hdmi_cvt 1024 1280 60 6 0 0 0" >> $CONFIG

    echo "# Audio Setting" >> $CONFIG
    echo "dtparam=audio=on" >> $CONFIG
    echo "dtoverlay=vc4-kms-v3d,noaudio" >> $CONFIG

    echo "# dtbo for waveshare 7.9inch LCD" >> $CONFIG
    echo "dtoverlay=vc4-kms-dsi-waveshare-panel,7_9_inch" >> $CONFIG
    
}
