#!/bin/bash

if ! pgrep -x "weston" > /dev/null; then
    /usr/bin/weston &
fi
