DESCRIPTION = "Intel SSD Firmware Update CLI Tool"
HOMEPAGE = "http://www.intel.com"
BUGTRACKER = ""

PR = "r0"

LICENSE = "Intel-binary-only"
LICENSE_FLAGS = "license_${PN}_${PV}"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta-issdfutcli/licenses/Intel-binary-only;md5=ca9b7afbfd111d7391b2febe579fa94a"

INSANE_SKIP:${PN} = "already-stripped"
INSANE_SKIP:${PN} += "ldflags"

SRC_URI += "file://issdfut"
SRC_URI += "file://issdfut_start.sh"
SRC_URI += "file://FirmwareModules/"

S = "${WORKDIR}"


do_install() {
	
	install -d ${D}/${bindir}
	install -m 0755 ${S}/issdfut ${D}/${bindir}
	install -m 0755 ${S}/issdfut_start.sh ${D}/${bindir}
	install -d ${D}/${libdir}/FirmwareModules/
	for file in ${S}/FirmwareModules/*; do
		install -m 0644 "$file" ${D}/${libdir}/FirmwareModules/
	done
}


FILES:${PN} += "${libdir}/FirmwareModules/*.so"
