package Recursion;

public class concept {
    // code to determine the infinite loop in recursion with n-- vd --n operations
    static void fun(int n){
        if(n==0)
        {
            return ;
        }
        System.out.println(n);
        // fun(n--); // this operation will make the n-- not workable as it is post
        fun(--n); // while this is pre operator hence it will execute subtraction
    }
}
