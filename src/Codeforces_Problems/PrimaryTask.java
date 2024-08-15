package Codeforces_Problems;

import java.util.Scanner;

public class PrimaryTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            if(impint(a)){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }
    }
    public static boolean impint( int a){
        int[] possibleImportantIntegers = {100, 1000, 10000 };

        for (int importantInteger : possibleImportantIntegers) {
            if (a == importantInteger) {
                return true;
            }
        }
        for (int x = 2; x <= 9; x++) {
            int concatenatedValue = Integer.parseInt("10" + x);
            if (a == concatenatedValue) {
                return true;
            }
        }

        return false;
    }
}

