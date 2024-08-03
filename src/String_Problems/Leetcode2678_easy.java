package String_Problems;

public class Leetcode2678_easy {
    //https://leetcode.com/problems/number-of-senior-citizens/description/?envType=daily-question&envId=2024-08-01

    public static void main(String[] args) {
       String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count=0;
        // count 11-12 characters
        for(int j=0;j<details.length;j++){
            int i=Integer.parseInt(String.valueOf(details[j].charAt(11)));
           // System.out.println(details[j].charAt(11)+" this is character");
            i=(i*10)+(Integer.parseInt(String.valueOf(details[j].charAt(12))));
           // System.out.println(i+" ->this is i");
            if(i>60){
                //System.out.println(details[j].charAt(11)+" "+details[j].charAt(12));
                count++;
               // System.out.println(" ->"+count);
            }
        }
        System.out.println(count);
    }
}
