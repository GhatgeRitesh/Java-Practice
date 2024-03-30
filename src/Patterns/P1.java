package Patterns;

public class P1 {
    //program to print the right and triangle
    /*

     *
     **
     ***
     ****

    */

    public static void main(String[] args) {
        int row=4;
        int a=1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
            }
            System.out.println("");
            a++;
        }
    }
}
