#!/bin/bash

# Find unique window id for each application
FLUTTER_DASHBOARD_WINDOW_ID=$(xdotool search --name --onlyvisible "flutter_dashboard")
FLUTTER_HEAD_UNIT_WINDOW_ID=$(xdotool search --name --onlyvisible "flutter_head_unit")

# Move each applications window to the position and set full-screen

xdotool windowmove $FLUTTER_DASHBOARD_WINDOW_ID 0 600 && \
xdotool windowfocus $FLUTTER_DASHBOARD_WINDOW_ID && \
xdotool key alt+F11 

xdotool windowmove $FLUTTER_HEAD_UNIT_WINDOW_ID 0 0 && \
xdotool windowfocus $FLUTTER_HEAD_UNIT_WINDOW_ID && \
xdotool key alt+F11
