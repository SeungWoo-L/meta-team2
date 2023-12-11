ENV_SETTING = " \
	nano \
	bash \
	wpa-supplicant \
	git	\
	can-utils \
	libsocketcan \
	openssh \
	bcm2835-dev \
"

META_OE = " \
	libgpiod \
"

FLUTTER = " \
	flutter-engine \
	flutter-pi \
	flutter-gallery \
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
	python3-wheel \
	python3-adafruit-pureio \
	python3-adafruit-platformdetect \
	python3-adafruit-circuitpython-register \
	python3-adafruit-blinka \
	python3-adafruit-circuitpython-pca9685 \
	python3-adafruit-circuitpython-busdevice \
	python3-pyserial \
	python3-pyusb \
	python3-typing-extensions \
"



IMAGE_INSTALL += " \
	${ENV_SETTING} \
	${META_OE} \
	${FLUTTER} \
	${VSOMEIP} \
	${PYTHON_SETTING} \
"
	
