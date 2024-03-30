import java.util.regex.*;
import java.util.*;
public class RegexDemo2 {
    // program to get the matching substring from the word

    public static void main(String[] args) {
        
        String mytext="Welcome to Programming world";

        Pattern obj=Pattern.compile("[A-Z]|[a-z]");
        
        Matcher matcher=obj.matcher(mytext);

        System.out.println(matcher.matches());

        while(matcher.find()){
          System.out.println(mytext.substring(matcher.start(),matcher.end()));
        }
    }
}
