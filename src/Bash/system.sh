id -u # retrives the dir and user number if it is root 0 is the value

name="Ritesh"
echo "${name:5:2}"
for (( i=${#name}-1;i>=0;i-- )); do
  echo "${name:i:6}"
done

#read -p "Enter a string: " str
#if [ "$str" == "$(echo $str | rev)" ]; then
#    echo "$str is a palindrome"
#else
#    echo "$str is not a palindrome"
#fi