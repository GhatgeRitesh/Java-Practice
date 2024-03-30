package String_Problems;

public class StringProblem1 {
    // code to check the string is palindrome or not
    public static void main(String[] args) {
        String Name="nitin";

        // using the StringBuilder approach
        StringBuilder sb= new StringBuilder();
        sb.append(Name);
        sb.reverse();
        System.out.println(sb);
        String result=(Name.equals(sb))?"Yes":"NO";
        // this method is always wrong

        System.out.println("Is the String Palindrome --> " +result);

        // using Two Pointer Approach
        String str="abababa";
        int i=0;int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;j--;
            }
            else{
                System.out.println("the given string is not a palindrome");
                return;
            }
        }
        System.out.println("the given string is palindrome");

    }
}
