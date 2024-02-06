#!/bin/bash

#Rotate the DSI-1 screen and ensure that all screens are positioned correctly.
xrandr --output HDMI-1 --auto --output DSI-1 --rotate right --below HDMI-1

# Disable device 'Goodix Capacitive TouchScreen'
PREFIX="pointer:"

DEVICE_NAME="Goodix Capacitive TouchScreen"

DEVICE_ID=$(xinput list --id-only "$PREFIX$DEVICE_NAME")

if [ -n "$DEVICE_ID" ]; then
    xinput disable "$DEVICE_ID"
    echo "Device '$DEVICE_NAME' has been disabled."
else
    echo "Device '$DEVICE_NAME' not found."
fi

# Map WaveShare Display to HDMI-1
xinput map-to-output 'WaveShare WS170120' HDMI-1



