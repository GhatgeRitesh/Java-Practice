import java.util.regex.*;

public class password_regex {

    // program for the password checking for 8+ digit and combination of special characters and the digits ,symbols
     public static void main(String[] args) {
      //   String pass="Rit!@#123";
      //   String pattern_pass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+={}\\[\\]:;\"'<>,.?/\\\\])[A-Za-z\\d!@#$%^&*()_+={}\\[\\]:;\"'<>,.?/\\\\]{8,}$";

        
      //   Pattern pattern= Pattern.compile(pattern_pass);

      //   Matcher matcher=pattern.matcher(pass);

      //   System.out.println(matcher.matches());
      String pattern="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()_+={}\\[\\]:;\"'<>,.?/\\\\])[A-Za-z\\d!@#$%^&*()_+={}\\[\\]:;\"'<>,.?/\\\\]{8,}$";

        Pattern p=Pattern.compile(pattern);
        Matcher matcher1=p.matcher("Rit!@#123");
        System.out.println(matcher1.matches());
        if(!matcher1.matches())
        {
            System.out.println("invalid password pattern");
        }
        else
          System.out.println("Valid");
     }

}
