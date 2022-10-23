echo "Enter number of elements: "
read n
declare -A arr
echo "Enter array elements: "
for ((i=0; i<n; i++))
do
read a[$i]
done
