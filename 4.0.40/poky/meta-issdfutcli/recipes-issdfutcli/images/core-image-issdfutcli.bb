DESCRIPTION = "Image to build the Intel SSD Firmware Update CLI Tool."

#INITRD = "${DEPLOY_DIR_IMAGE}/${IMAGE_BASENAME}-${MACHINE}.ext2.lzma"
INITRD_LIVE = "${IMGDEPLOYDIR}/${IMAGE_LINK_NAME}.ext3.lzma"

ROOTFS = ""

IMAGE_INSTALL = "\
    packagegroup-core-boot \
	issdfutcli \
	autologin \
    "

IMAGE_INSTALL:remove = "shadow"

IMAGE_FSTYPES = "ext3.lzma live iso"
NOISO = "0"

licenseCopyFunction () {
    mkdir -p ${ISODIR}
    cp -r ${TMPDIR}/deploy/licenses ${ISODIR}/licenses
}

IMAGE_PREPROCESS_COMMAND += "licenseCopyFunction;"

#do_bootimg[depends] += "${IMAGE_BASENAME}:do_rootfs"

do_bootimg[depends] += "${IMAGE_BASENAME}:do_image_ext3"

inherit core-image
