package Recursion;

import java.util.ArrayList;

public class Fabonacci_Numbers {

    // code to implement fabonacci numbers with use of recursion
    // 0,1,1,2,3,5,8,...

    public static void main(String[] args) {
        System.out.println(getfibo(6));

        //print fibonacci series for n numbers
        int n=getseries(6);
        System.out.println("\n"+n);
    }

    //code to get n'th fibonacci number
    static int getfibo(int n)
    {
        if(n<2)
        {
            return n;
        }

        return getfibo(n-1) + getfibo(n-2);
    }

    static int getseries(int n)
    {
        if(n<2)
        {
            return n;
        }
        ArrayList<Integer> num=new ArrayList<>();
        num.add(n);
        System.out.print(n);
        return getseries(n-1)+getseries(n-2);
    }

}
