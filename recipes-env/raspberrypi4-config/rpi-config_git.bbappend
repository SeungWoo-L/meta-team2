#ACTIVATE_I2C
ENABLE_I2C = "1"

# Waveshare "C" 1024x600 7" Rev2.1 IPS capacitive touch (http://www.waveshare.com/7inch-HDMI-LCD-C.htm)
WAVESHARE_1024X600_C_2_1 = "1"

# GPU memory
GPU_MEM_1024 = "1"

#Remove Splash
DISABLE_SPLASH = "1"

do_deploy:append() {
    echo "# Setting for 2-CH FD CAN Hat" >> $CONFIG
    echo "dtoverlay=spil-3cs" >> $CONFIG
    echo "dtoverlay=mcp251xfd,spi0-0,interrupt=25" >> $CONFIG
    echo "dtoverlay=mcp251xfd,spi1-0,interrupt=24" >> $CONFIG
    
    echo "# Install dtbo for waveshare 7.9inch LCD" >> $CONFIG
    echo "dtoverlay=vc4-kms-dsi-waveshare-panel,7_9_inch" >> $CONFIG

    echo "# Audio Setting" >> $CONFIG
    echo "dtparam=audio=on" >> $CONFIG
    echo "dtoverlay=vc4-kms-v3d,audio" >> $CONFIG

    echo "#start_x=1" >> $CONFIG
}
