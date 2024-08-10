package Codeforces_Problems;

import java.util.Scanner;

public class FindKdistinctPointsforFixedCenter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();

       while( t != 0 ) {
            int ac = sc.nextInt();
            int bc = sc.nextInt();
            int k = sc.nextInt();

               for (int i = 0; i < k; i++) {
                   int x = ac + (i % 3) - (i / 3);
                   int y = bc - (i % 3) + (i / 3);

                   System.out.println(x + " " + y);
               }

            t--;
        }
    }
}
