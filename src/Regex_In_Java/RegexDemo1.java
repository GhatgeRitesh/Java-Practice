import java.util.regex.*;
public class RegexDemo1 {
    // program for testing the single digit validation

    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("[abc]");

        Matcher matcher=pattern.matcher("z");

        System.out.println(matcher.matches());
    
        if(matcher.matches()){
            System.out.println("valid input");
        }
        else{
            System.out.println("invalid input");
        }    
    }
   
}
