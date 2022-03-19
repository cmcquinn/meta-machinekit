SUMMARY = "Core image"

IMAGE_FEATURES += "splash tools-debug debug-tweaks"

LICENSE = "MIT"

inherit core-image features_check extrausers

# let's make sure we have a good image..
REQUIRED_DISTRO_FEATURES = "systemd zeroconf"

CORE_IMAGE_BASE_INSTALL += " \
    packagegroup-machinekit-core \
"

EXTRA_USERS_PARAMS = "\
useradd -p '' machinekit; \
"
