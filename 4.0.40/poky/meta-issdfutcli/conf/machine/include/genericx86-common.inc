include conf/machine/include/x86/x86-base.inc
MACHINE_FEATURES += "efi pcbios"

PREFERRED_VERSION_linux-yocto = "5.18%"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-yocto"
PREFERRED_PROVIDER_virtual/xserver ?= "xserver-xorg"
XSERVER ?= "${XSERVER_X86_BASE} \
            ${XSERVER_X86_EXT} \
            ${XSERVER_X86_I915} \
            ${XSERVER_X86_I965} \
            ${XSERVER_X86_FBDEV} \
            ${XSERVER_X86_VESA} \
            ${XSERVER_X86_MODESETTING} \
           "

MACHINE_EXTRA_RRECOMMENDS += "linux-firmware v86d eee-acpi-scripts"

GLIBC_ADDONS = "nptl"

EXTRA_OECONF:append:pn-matchbox-panel-2 = " --with-battery=acpi"
