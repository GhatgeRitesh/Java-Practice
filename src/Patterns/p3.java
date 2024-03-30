package Patterns;

public class p3 {

    public static void main(String[] args) {
        int row=4;
        for(int i=0;i<row;i++)
        {
         for(int j=row;j>i;j--)
         {
             System.out.print(" * ");
         }
            System.out.println("");
        }
        int a=1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
            a++;
        }
    }
}
