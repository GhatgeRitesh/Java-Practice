echo "code to execute conditional stmts in bash"
num="Yes"
num1=20
#Also we can use -ge for >= ,-le for <=, ne for != equals
if [ $num == "Yes" ] && [ $num1 == 20 ]
then
  echo "condition is true"
else
  echo "condition is false"
fi
#Arithemetic calculations


echo "Arithmetic calculations"
a=1;
b=2;
c=$((a+b))
echo $(((a+b)+c))

#list like arrays in bash
arr=(1 2 3 "four" 5) #one type of declaration and population of arrays
declare -a newarr #declaring or creating new empty array

newarr+=("ritesh") #manual populating array
newarr+=(1)

echo "${arr[0]}" #print the element on 0th index

echo "${arr[@]}" #to print all elements of array

# for loop
#Using with the array
for item in "${arr[@]}"; do
  echo "$item"
done

#another method
echo "Method two "
for i in "${newarr[@]}"; do
  echo "${newarr[i]}"
done

#Method three basic loop
echo "basic for loop"
N=10
for ((i=0;i<=$N;i++)) ; do
  echo "$i"
done

3.5. Create a report by combining your new column with the source table
Save your report as a CSV file.

Remember to validate your results.

Click here for Hint 1
Write the new array to file line-by-line.

Intitialize the file with a header.

Click here for Hint 2
Use redirection and recall how to merge two files side-by-side.

Ensure your final report has the correct CSV format.

Click here for Solution

#!/bin/bash
csv_file="./arrays_table.csv"
# parse table columns into 3 arrays
column_0=($(cut -d "," -f 1 $csv_file))
column_1=($(cut -d "," -f 2 $csv_file))
column_2=($(cut -d "," -f 3 $csv_file))
# print first array
echo "Displaying the first column:"
echo "${column_0[@]}"


## Create a new array as the difference of columns 1 and 2
# initialize array with header
column_3=("column_3")
# get the number of lines in each column
nlines=$(cat $csv_file | wc -l)
echo "There are $nlines lines in the file"
# populate the array
for ((i=1; i<$nlines; i++)); do
  column_3[$i]=$((column_2[$i] - column_1[$i]))
done
echo "${column_3[@]}"
## Combine the new array with the csv file
# first write the new array to file
# initialize the file with a header
echo "${column_3[0]}" > column_3.txt
for ((i=1; i<nlines; i++)); do
  echo "${column_3[$i]}" >> column_3.txt
done
paste -d "," $csv_file column_3.txt > report.csv


###############################################################
3.5. Create a report by combining your new column with the source table
Save your report as a CSV file.

Remember to validate your results.

Click here for Hint 1
Write the new array to file line-by-line.

Intitialize the file with a header.

Click here for Hint 2
Use redirection and recall how to merge two files side-by-side.

Ensure your final report has the correct CSV format.

Click here for Solution

#!/bin/bash
csv_file="./arrays_table.csv"
# parse table columns into 3 arrays
column_0=($(cut -d "," -f 1 $csv_file))
column_1=($(cut -d "," -f 2 $csv_file))
column_2=($(cut -d "," -f 3 $csv_file))
# print first array
echo "Displaying the first column:"
echo "${column_0[@]}"
## Create a new array as the difference of columns 1 and 2
# initialize array with header
column_3=("column_3")
# get the number of lines in each column
nlines=$(cat $csv_file | wc -l)
echo "There are $nlines lines in the file"
# populate the array
for ((i=1; i<$nlines; i++)); do
  column_3[$i]=$((column_2[$i] - column_1[$i]))
done
echo "${column_3[@]}"
## Combine the new array with the csv file
# first write the new array to file
# initialize the file with a header
echo "${column_3[0]}" > column_3.txt
for ((i=1; i<nlines; i++)); do
  echo "${column_3[$i]}" >> column_3.txt
done
paste -d "," $csv_file column_3.txt > report.csv