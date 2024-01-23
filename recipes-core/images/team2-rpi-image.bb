SUMMARY = "Basic image for Team2 HeadUnit project"

inherit core-image


IMAGE_FSTYPES = " \
                tar.bz2 \
                ext4 \
                rpi-sdimg \
"


#IMAGE_ROOTFS_SIZE = "2097152"
#IMAGE_ROOTFS_EXTRA_SPACE = "102400"
#IMAGE_ROOTFS_ALIGNMENT = "10240"

CORE_IMAGE_BASE_INSTALL = "\
	packagegroup-core-boot \
	packagegroup-base-extended \
	${CORE_IMAGE_EXTRA_INSTALL} \
"

LINGUAS_KO_KR = "ko-kr"
LINGUAS_EN_US = "en-us"
IMAGE_LIGUAS = "${LINGUAS_KO_KR} ${LINGUAS_EN_US}"
IMAGE_OVERHEAD_FACTOR = "1.3"

IMAGE_INSTALL:append = " sudo"
inherit extrausers

EXTRA_USERS_PARAMS = " \
                        groupadd seame; \
                        useradd -p \$(openssl passwd 1234) team2; \
                        useradd -a -G sudo team2; \
                        useradd -g seame team2; \
"


KIRKSTONE_LOCAL_GETTY ?= "\
                        ${IMAGE_ROOTFS}${systemd_system_unitdir}/serial-getty@.service \
                        ${IMAGE_ROOTFS}${systemd_system_unitdir}/getty@.service \
"

local_autologin () {
        sed -i -e 's/^\(ExecStart *=.*getty \)/\1--autologin root /' ${KIRKSTONE_LOCAL_GETTY}
}

ROOTFS_POSTPROCESS_COMMAND += "local_autologin;"

