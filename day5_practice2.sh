#!/bin/sh
echo "Write a program that reads 5 Random 3 Digit values and then outputs the minimum and the maximum value"
a=()
for ((i=0;i<5;i++))
do
  k=$((RANDOM%1000))
  if [ "$k" -lt 100 ]
  then
	k=$(("$k"+100))
  fi
   a+=("$k") 
done 
echo "val=${a[*]}"
max=${a[0]}
min=${a[0]}
for i in ${a[*]}
do 
if [ "$i" -gt "$max" ]
then
max="$i"
fi
if [ "$i" -lt "$min" ]
then
min="$i"
fi
done 
echo "max=$max"
echo "min=$min"
echo "#########################################"

#read -p "Enter the day" d 
#read -p "Enter the month" m
#case "$m" in
#	"March")
#	if [ "$d" -gt 1 ] && [ "$d" -lt 31 ]
#	then
#		echo "True"
#	else
#		echo "False"
#	
#	fi
#		;;
#	"April")
#	if [ "$d" -gt 1 ] && [ "$d" -lt 31 ]
#	then
#		echo "True"
#	else
#		echo "False"	
#	fi
#		;;
#	"May")
#	if [ "$d" -gt 1 ] && [ "$d" -lt 31 ]
#	then
#		echo "True"
#	else
#		echo "False"
#	fi
#		;;
#	*)
#	echo "Not in the list"
#	;;
#	esac
###############Leap year#####
read -p "Enter the year" y
ct="${#y}"
if [ "$ct" == 4 ]
then
if [ $(($y%4)) == 0 ]
then

echo "iuiu"
fi
fi
