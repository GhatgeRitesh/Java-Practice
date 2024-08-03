package Strivers_455.Step1_31;

public class Recursion_8 {
    // check if string is positive or not
    public static void main(String[] args) {
        String a ="A man, a plan, a canal: Panama";
        String b=a.toLowerCase();
        System.out.println( checkPalindrome(b,0, a.length()-1));
    }
    public static boolean checkPalindrome(String a,int s, int e){
        if(s>=e){
            System.out.println("string is palindrome");
            return true;
        }
        if (!Character.isLetterOrDigit(a.charAt(s))) {
            s++;
        }
        else if(!Character.isLetterOrDigit(a.charAt(e))) {
            e--;
        }
        else {
            if(!(a.charAt(s)==a.charAt(e))){
                System.out.println(a.charAt(s)+" "+a.charAt(e)+s+" "+e);
                return false;
            }
        }
       return  checkPalindrome(a,s+1,e-1);
    }
}
