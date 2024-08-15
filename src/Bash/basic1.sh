#Write a script to display "Hello, World!" on the terminal.
#Write a script to list all the files and directories in the current directory.
#Write a script to display the current date and time.
#Write a script to create a directory and navigate into it.
#1
echo "Hello World!"
#2
ls
#3
date
#4
mkdir newdir && cd ./newdir

#Variables and Input:
#
#Write a script that takes a user’s name as input and greets them with "Hello, [Name]!".
#Write a script to calculate the sum of two numbers provided by the user.
#Write a script to swap the values of two variables.
#1
#echo "Enter your Name \n"
#read name
#echo "Hello $name"

#2
echo "Enter Two Number "
read -p "Enter first number:" a
read -p"Enter second number:" b
echo "The sum of Two numbers $a $b is : $((a + b))"
#3
echo "swaping the a and b values"
temp=$a
a=$b
b=$temp
echo $a $b

#Conditional Statements:
#
#Write a script to check if a given number is even or odd.
#Write a script to check if a file exists in the current directory.
#Write a script to compare two numbers and display which one is greater.
#Write a script to check if a user is root or not.
#1
read -p "Enter the number" num
if [ $((num % 2)) -eq 0 ]; then
  echo "The number is even"
else
  echo "The number is odd"
fi
#2
read -p "Enter the File name:" file_name
if [ -f "$file_name" ]; then
  echo "$file_name exists"
else
  echo "File do not exists"
fi
#3
read -p "Enter the first number :" n
read -p "Enter the second number :" m
if [ $n -gt $m ]; then
  echo "$n is the greater"
else
  echo "$m is greater number"
fi
#4
if [ "$(id -u)" -eq 0 ]; then
  echo "you are root"
else
  echo "you are not root"
fi

id -u

#Loops:
#
#Write a script to print numbers from 1 to 10.
#Write a script to print the multiplication table of a given number.
#Write a script to find the factorial of a number using a for loop.
#Write a script to print all even numbers between 1 and 50.
#1
echo "using for loop"
for i in {1..10}; do
  echo $i
done

#2
read -p "Enter the number which you want table" num
for i in {1..10}; do
  echo "$num x $i = $((num * i))"
done

#3
echo "finding factorial of the number using for loop"
read -p "Enter the number to find factorial :"num
fact=1
for ((i=0; i<=num; i++)); do
  fact=$((fact * i))
done
fact

#4
for i in {1..50}; do
  if [ $((i % 2)) -eq 0 ]; then
    echo -n $i " "
  fi
done

#String Manipulation:
#
#Write a script to count the number of characters in a string.
#Write a script to reverse a string provided by the user.
#Write a script to check if a string is a palindrome.
#1
read -p "Enter the String " str
echo "Length of the String is ${#str}"
#2
read -p "Enter a string: " str
reversed_str=""
length=${#str}

for (( i=$length-1; i>=0; i-- )); do
  reversed_str="$reversed_str${str:$i:1}"
done

echo "Reversed string is: $reversed_str"
#string character access
name="Ritesh"
echo "${name:0:6}"


