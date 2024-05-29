#ACTIVATE_I2C
ENABLE_I2C = "1"

# GPU memory
GPU_MEM_1024 = "1"

#Remove Splash
DISABLE_SPLASH = "1"

do_deploy:append() {
    echo "# Setting for 2-CH FD CAN Hat" >> $CONFIG
    echo "dtoverlay=spil-3cs" >> $CONFIG
    echo "dtoverlay=mcp251xfd,spi0-0,interrupt=25" >> $CONFIG
    echo "dtoverlay=mcp251xfd,spi1-0,interrupt=24" >> $CONFIG

    echo "# Audio Setting" >> $CONFIG
    echo "dtparam=audio=on" >> $CONFIG
    echo "dtoverlay=vc4-kms-v3d,audio" >> $CONFIG

    echo "#start_x=1" >> $CONFIG
}
