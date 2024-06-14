#ACTIVATE_I2C
ENABLE_I2C = "1"

do_deploy:append() {
    echo "# Setting for 2-CH FD CAN Hat" >> $CONFIG
    echo "dtparam=spi=on >> $CONFIG
    echo "dtoverlay=spi1-3cs >> $CONFIG

    echo "dtoverlay=mcp251xfd,spi0-0,interrupt=25" >> $CONFIG
    echo "dtoverlay=mcp251xfd,spi0-1,interrupt=24" >> $CONFIG
}
