import java.util.regex.*;

public class gmail_regex {
    public static void main(String[] args) {
        // program to check the valid email id or not 


        // String mymail="abc@gmail.com";
        // Pattern pattern=Pattern.compile("^.*@gmail\\.com$");
        // Matcher matcher=pattern.matcher(mymail);

        // System.out.println(matcher.matches());
        String pattern="^.*@gmail\\.com$";

        Pattern p=Pattern.compile(pattern);

        Matcher matcher=p.matcher("abc@gmail.com");

        if(!matcher.matches())
        {
            System.out.println("invalid Gmail Pattern");
           
        }
        else
           System.out.println("valid Email");
    }
}
