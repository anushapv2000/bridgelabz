Students=("Saran" "Arjun" "Venkat" "Pooja")
TodayPresent=("Arjun" "Pooja") #
echo "Total ${Students[*]}"
echo "Present ${TodayPresent[*]}"
arr=" ${TodayPresent[*]} "
for i in "${Students[@]}"
do
if  [[ "$arr" =~ " $i " ]];
then
echo "$i is present"
else
echo "$i is absent"
fi
done

