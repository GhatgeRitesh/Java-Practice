package Patterns;

public class p4 {
    public static void main(String[] args) {
        int row=4;
        for(int i=row;i>0;i--)
        {
            for(int j=row;j<i;j--)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
