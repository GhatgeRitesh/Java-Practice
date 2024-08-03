package Maps_In_Java;

import java.util.Scanner;

public class Hashing_striver1 {
    // coding the basic hashing
    // getting the length of array and get the how many times element is checked
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }

        //precompute method
        int[] hash=new int[13];
        for(int i=0; i<n;i++){
            hash[arr[i]]+=1;
        } // hash array is ready


        System.out.println("Enter the amount of elements  to be checked");
        int q=sc.nextInt();
        while(q!=0){
            // this is the fetch method
            int number=sc.nextInt();

            System.out.println(hash[number]);
        }
    }
}
