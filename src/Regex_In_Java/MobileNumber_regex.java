import java.util.*;
import java.util.regex.*;
public class MobileNumber_regex {
    public static void main(String[] args) {
      // program to find the valid mobile number that has 10 digit and starts with the 9|8|7

      String no="+919876543210";
    
      String no1="6747234982";

      Pattern pattern=Pattern.compile("[+91]{3}[987]{1}[0-9]{9}");

      Matcher matcher1=pattern.matcher(no);
      Matcher matcher2=pattern.matcher(no1);

      System.out.println(matcher1.matches());
      System.out.println(matcher2.matches());
    }
}
