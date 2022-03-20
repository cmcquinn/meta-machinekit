DESCRIPTION = "MachineKit core packages"

inherit packagegroup

MACHINEKIT_CORE_PACKAGES = " \
	machinekit-hal \
	"

RDEPENDS_${PN} = "${MACHINEKIT_CORE_PACKAGES}"
