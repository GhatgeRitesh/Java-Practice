package Patterns;

import java.util.*;
import java.util.Scanner;

public class hashNumber {
    // code to create hash id with the unique Name
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String Name=sc.nextLine();
        System.out.println("Enter Email");
        String Email=sc.nextLine();
        int id=0;
        for(int i=0;i<Name.length() && i<Email.length();i++)
        {
            id=17*id+Name.charAt(i);
        }
        System.out.println(id+" this is id");
        //1517398682 125799135
        //1517398682
        //6032276

    }

}
