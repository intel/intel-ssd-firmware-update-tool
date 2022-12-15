
LICENSE = "Intel-binary-only"
LICENSE_FLAGS = "license_${PN}_${PV}"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta-issdfutcli/licenses/Intel-binary-only;md5=ca9b7afbfd111d7391b2febe579fa94a"


ASNEEDED = ""

PR = "r1"

DEPENDS = "boost"

SRC_URI = "file://autologin_src.tar.gz"

S = "${WORKDIR}/autologin_src"

INSANE_SKIP:${PN} = "ldflags"
INSANE_SKIP:${PN}-dev = "ldflags"

EXTRA_OEMAKE = "'GPP=${CXX}'"

PARALLEL_MAKE = ""

do_install() {
	install -d -m 755 ${D}/usr/sbin
	install -p -m 755 ${S}/autologin ${D}/usr/sbin/
}


