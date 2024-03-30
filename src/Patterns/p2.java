package Patterns;

public class p2 {
    // program to print the table of stars

//    ******
//    ******
//    ******
//    ******

    public static void main(String[] args) {
        int row=5;
        int a=1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(a +" ");
            }
            System.out.println("");
            a++;
        }
    }
}
