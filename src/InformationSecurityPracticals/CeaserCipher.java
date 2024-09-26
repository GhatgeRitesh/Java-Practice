package InformationSecurityPracticals;

import java.util.ArrayList;
import java.util.Scanner;

public class CeaserCipher {

    //Program to implement ceaser cipher and brute force attack
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String msg="Practical to implement caesor cipher and bruteforce attack";
        System.out.println("Message is :"+msg);
        String enc=Encrypt(msg);
        ArrayList<String> list=new ArrayList<>();
        list=DCrypt(enc);
        int cnt=1;
        for(String s:list){
            if(s.equals(msg)){
                break;
            }
            cnt++;
        }
        System.out.println("The Key is : "+cnt++);
    }
    public static String Encrypt(String msg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Key");
        int key=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<msg.length();i++){
            //c=(k,p)%26;

            char ch=msg.charAt(i);
            if(Character.isLetter(ch)){
                char base=Character.isUpperCase(ch)? 'A':'a';
                char c=(char)((ch-base+key)%26 + base);
                sb.append(c);
            }
            else {
                sb.append(ch);
            }
        }
        System.out.println("Encrypted Message : "+sb.toString());
        return sb.toString();
    }
    public static ArrayList<String> DCrypt(String enc){
        System.out.println("Drypting the message");
        ArrayList<String> list=new ArrayList<>();
        for(int i=1; i<27;i++){
            StringBuilder sb=new StringBuilder();
             for(int j=0;j<enc.length();j++){
                 char ch=enc.charAt(j);
                 if(Character.isLetter(ch)){
                     char base=(Character.isUpperCase(ch))?'A':'a';
                     char c=(char)((ch - base - i + 26)%26+base);
                     sb.append(c);
                 }
                 else{
                     sb.append(ch);
                 }
             }
             list.add(sb.toString());
            System.out.println(sb.toString());
        }
//        System.out.println(list.toString());
        return list;
    }
}
