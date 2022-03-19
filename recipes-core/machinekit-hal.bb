# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   debian/copyright
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=f4adc6286df4f727b4287ae730542d0d \
                    file://src/libraries/proto/LICENSE;md5=4cf6c4a0ba2271f98f85c05c52f75bce \
                    file://debian/copyright;md5=8db7bc9378cefbeddf0d43a4efdbd8b7"

DEPENDS = "nanopb \
    libmodbus-dev \
    libudev-dev \
    libglib2.0-dev \
    libgtk2.0-dev \
    libusb-1.0-0-dev \
    python3 \
    libpython3-dev \
    cython3 \
    dh-python \
    pkg-config \
    psmisc \
    libboost-dev \
    libzmq3-dev \
    libczmq-dev \
    libjansson-dev \
    libwebsockets-dev \
    python3-zmq \
    procps \
    liburiparser-dev \
    libssl-dev \
    python3-setuptools \
    uuid-dev \
    uuid-runtime \
    libavahi-client-dev \
    libcmocka-dev \
    libprotobuf-dev \
    protobuf-compiler \
    python3-protobuf \
    libprotoc-dev \
    python3-simplejson \
    python3-sh \
    python3-installer \
    python3-pytest \
    libcgroup-dev \
    yapps2 \
    python3-build \
    python3-yapps \
    python3-pyftpdlib \
    python3-pip \
    python3-venv \
    libck-dev"

SRC_URI = "git://github.com/machinekit/machinekit-hal.git;protocol=https"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Readline
# NOTE: the following library dependencies are unknown, ignoring: NAMES
#       (this is based on recipes that have previously been built and packaged)
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

