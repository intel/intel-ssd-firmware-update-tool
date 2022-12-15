#!/bin/sh
#This script starts issdfut then turns off the computer

clear

mount -t sysfs sysfs /sys

issdfut

echo "Eject the CD or unplug the USB flash drive containing the Intel(R) SSD Firmware Update Tool, then shutdown your computer."
echo "Be sure to wait 10 seconds before starting your computer again."
read -p "Press Enter to shutdown " key
case $key in
[Nn]* )
	# DO NOTHING
;;
*) 
	echo o > /proc/sysrq-trigger
;;
esac
