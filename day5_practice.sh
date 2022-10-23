#!/bin/bash
k=$((RANDOM%10))
echo "single digit RANDOM number is $k"


#############random dice number#########
k=$(($((RANDOM%6))+1))
echo "Dice value using random function is $k"

##########adding dice number########
a=$(($((RANDOM))%6+1))
b=$(($((RANDOM))%6+1))
echo "Two value of dice and sum  are $a+$b=$((a+b))"

echo "read 5random 2 digit values and find the sum and avg"
for ((i=0; i<5; i++))
do
	k=$((RANDOM%100))
	if [ "$k" -lt 10 ];
	then 
	   k=$(($k+10))
	fi
	echo " read value is $k"
	sum=$(( $sum + $k ))
done
avg=$(( sum/5 ))
echo "Sum is $sum"
echo "average is $avg"
########unit conversion#########
printf "choose 1:feet to inches  \n 2:inches to feet \n"
read x
if [ $x == 1 ]
then
read -p "enter the feet" f
inch=$(( 12*$f ))
echo "$f feet = $inch inches"
else
read -p "enter the inch" inches
feet=$(( $inches/12 ))
echo "$inches inches = $feet feet"
fi
printf " Enter the values for feet to metres \n"
read -p "feet1 = " f1
read -p "feet2 = "  f2
#printf $f1
echo $f1 $f2 | awk '{ m1=$1*0.3048 }{ m2=$2*0.3048}{ print "feet to metres="m1"x"m2}'
echo $f1 $f2 | awk '{ m1=$1*0.3048 }{ m2=$2*0.3048}{ plt=0.0002471053815*m1*m2} {acr=plt*25}{print "25 acres of land="acr}'
