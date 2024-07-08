package MultidimensionArrays;

import java.util.Scanner;

public class Basic1 {
    // program to solve first 4 questions simple
//   1.How do you declare and initialize a 2D array
//      with 3 rows and 3 columns in Java? Provide an example.
//   3.Write a Java program to iterate through all
//     elements of a 2D array and print them.
//   4.Write a Java method that takes a 2D array as input
//     and returns the sum of all its elements.
    public static void main(String[] args) {

        // declaring 4*3 array 4 width and 3 height
        //int[][] arr=new int[n][m]; here n=4 and m=3
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        //travers through array
        for(int i=0;i<3;i++){      //column
            for(int j=0;j<4;j++){  //row
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        //getting input and returning sum
        System.out.println("Enter the array size Array size and number of arrays");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int[][] nums=new int[n][m];
            System.out.println("Enter elements :");
        int sum=0;
        for(int i=0;i<m;i++)
        {
            System.out.print("{ ");
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
            System.out.print(" },");
            System.out.println(" ");
        }
            System.out.println("sum of all elements is :"+sum);
    }
}
