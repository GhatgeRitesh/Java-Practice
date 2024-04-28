package String_Problems;

public class GCD {
    // code to solve the problem no 1071 from leetcode
    // finding gcd of given  string



    // numerical gcd
    public static int findgcd(int num1,int num2)
    {
       //solving by euclidean algorithm
        while(num2!=0)
        {
           int temp=num2;
           num2=num1%num2;
           num1=temp;
        }
        return num1;
    }
    //method 2 to find gcd
    public static int gcd(int a,int b)
    {
        return b==0 ? a : gcd(b,a%b);
    }
    //string problem gcd
    public static String getStringGCD(String str1,String str2){
        // to find gcd of string we will check both strings are equal or not
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        // if both are equal then we shall get string gcd
        // return substring from 0 to gcd of both string length
        int gcd=gcd(str1.length(), str2.length());
        return str1.substring(0,gcd);
    }
    public static void main(String[] args) {
        int num1=132;
        int num2=60;
        String str1="Aba";
        String str2="Aba";
        System.out.println(findgcd(num1,num2));
        System.out.println(getStringGCD(str1,str2));
    }
}
