// program for introduction of buble sort 
// also known as sinking sort and exchange sort
// with every pass the largest element will come to the end of the array

// two pointers used and two loops used 
//  first loop to make pass n-1 times
// second loop will make the comparison until the length-i; indexs in the array

// space complexity is O(1) constant ; means no creation of other arrays and coping etc.
//this is the inplace sorting algorithm so space complexity is same as it was previous
// the time complexity of the algorithm is best case O(n) in sorted array and worst case O(n^2) in sorted in decreasing order


// buble sort is the stable algoriothms
//consider the array 10,20,10,20,30 first 10 is red and second one is the black then after sorting array properties will be same red will always be ahead of the black one as 10 10 20 20 30.
import java.util.*;

public class bubleSort{

   
    public static void buble(int[] arr){
        int count=0;
        // run the steps n-1 times
        for(int i=0;i<arr.length;i++)
        {   
            boolean flag=false;
            // for each step the max item will come to the end of the array
            for(int j=1;j<arr.length-i;j++)
            {
                
                // if the element is smaller then previous item
                if(arr[j]<arr[j-1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                    count++;
                    // System.out.println(Arrays.toString(arr) +" "+count); 
                }
            }
            // if for the perticular value of i the j is not swapped then array is sorted and you should stop the execution
            if(!flag){
                break;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr={10,20,30,10,30};
        int[] nums={3,1,5,4,2};
        int[] num1={1,2,3,4,5};
        int[] num2={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        buble(arr);
        System.out.println(Arrays.toString(nums));
        buble(nums); 
        buble(num1); 
        buble(num2); 
        
    }
}

// finally a successfull run every possible run done
