ENV_SETTING = " \
	nano \
	bash \
	tree \
	wpa-supplicant \
	git	\
	can-utils \
	libsocketcan \
	openssh \
	bcm2835-dev \
	udev-rules-rpi \
	udev-extraconf \
	supervisor \
	xdotool \
"

META_OE = " \
	libgpiod \ 
	mpv \
"

FLUTTER_APP = " \
	dashboard \
	dashboard-dev \
	dashboard-auto \
	headunit \
	headunit-dev \
	headunit-auto \
	touchscreen-init \
	window-init \
"
	

VSOMEIP = " \
	common-api-c++ \
	common-api-c++-dev \
	vsomeip \
	vsomeip-dev \
	common-api-c++-someip \
	common-api-c++-someip-dev \
"


PYTHON_SETTING = " \
	python3 \
	python3-core \
	python3-supervisor \
	python3-numpy \
	python3-pip \
"

PIRACER_SETTING = "\
	python3-adafruit-blinka \
	python3-adafruit-circuitpython-busdevice \
	python3-adafruit-circuitpython-framebuf \
	python3-adafruit-circuitpython-ina219 \
	python3-adafruit-circuitpython-pca9685 \
	python3-adafruit-circuitpython-register \
	python3-adafruit-circuitpython-requests \
	python3-adafruit-circuitpython-ssd1306 \
	python3-adafruit-circuitpython-typing \
	python3-adafruit-platformdetect \
	python3-adafruit-pureio \
	python3-pyftdi \
	python3-pyserial \
	python3-pyusb \
	python3-typing-extensions \
	python3-wheel \
	opencv \
	rpi-gpio \
	python3-piracer-py \
"
CUSTOM_APPS = "\
	canreceiver-dev \
	carinfo-dev \
	carcontrol \
	carcontrol-dev \
"

IMAGE_INSTALL += " \
	${ENV_SETTING} \
	${META_OE} \
	${VSOMEIP} \
	${PYTHON_SETTING} \
	${PIRACER_SETTING} \
	${CUSTOM_APPS} \
	${FLUTTER_APP} \
"
	