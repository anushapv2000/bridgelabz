items=("Apple" "Mango" "Orange" "Mango" "Apple" "Grapes")
a=()
declare -A arr

for i in "${items[@]}"
do
if [[ -z ${arr[$i]} ]];then
a+=("$i")
fi
arr["$i"]=1
done
echo "(${items[@]})"
echo "(${a[@]})"
