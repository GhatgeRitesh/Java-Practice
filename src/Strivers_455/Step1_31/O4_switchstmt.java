package Strivers_455.Step1_31;

import java.util.Scanner;

public class O4_switchstmt {
    // program to learn swtich statement in java
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String letter=sc.nextLine();
        switch(letter)
        {
            case "ritesh":
                System.out.println("admin");
                break;
            case "user":
                System.out.println("user");
            default:
                System.out.println("Invalid User !");
        }
        switch(letter){
            case "ritesh"->{
                System.out.println("new Switch");
                System.out.println("this is lline two ");
            }
            case "user" ->
                System.out.println("this is another user");
            default -> System.out.println("invalid user");
        }
    }
}
