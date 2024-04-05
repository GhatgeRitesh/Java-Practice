package Recursion;

public class R1 {

    //code to implement the syntax and workflow of recursion

    public static void print(int n){
        if(n>5)
        {
            System.out.println("end");
            return;
        }
        System.out.println(n);
        int top=n++;
        print(n+1);
        System.out.println(top);
    }
    // the top pointer stores value of n in implicit stack while recursion is working
    //


    public static void main(String[] args) {
        print(2);
    }

}
