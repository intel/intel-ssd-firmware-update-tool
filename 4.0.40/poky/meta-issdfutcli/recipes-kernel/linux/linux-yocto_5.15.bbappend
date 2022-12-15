FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# use Linux 5.19.0 kernel
LINUX_VERSION = "5.19.0"
LINUX_VERSION:genericx86-64 = "5.19.0"
SRCREV = "3d7cb6b04c3f3115719235cc6866b10326de34cd"
SRCREV_machine:genericx86-64 = "${SRCREV}"
KBRANCH:genericx86-64  = "linux-5.19.y"
BB_HASH_IGNORE_MISMATCH = "1"

SRC_URI:genericx86-64 = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;name=machine;branch=linux-5.19.y; \
                         git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}; \
                         file://defconfig"