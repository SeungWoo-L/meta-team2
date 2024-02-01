#!/bin/bash

# Map WaveShare Display to HDMI-1
xinput map-to-output 'WaveShare WS170120' HDMI-1

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