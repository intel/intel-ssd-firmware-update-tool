FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# use Linux 6.1.0 kernel
LINUX_VERSION = "6.1.0"
LINUX_VERSION:genericx86-64 = "6.1.0"
SRCREV = "830b3c68c1fb1e9176028d02ef86f3cf76aa2476"
SRCREV_machine:genericx86-64 = "${SRCREV}"
KBRANCH:genericx86-64  = "linux-6.1.y"
BB_HASH_IGNORE_MISMATCH = "1"

SRC_URI:genericx86-64 = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;name=machine;branch=linux-6.1.y; \
                         git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-5.15;destsuffix=${KMETA}; \
                         file://defconfig"