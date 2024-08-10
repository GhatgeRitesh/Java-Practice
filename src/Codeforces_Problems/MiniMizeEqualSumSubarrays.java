package Codeforces_Problems;

import java.util.Scanner;

public class MiniMizeEqualSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t != 0) {
            int n = sc.nextInt();
            int[] per = new int[n];
            for (int i = 0; i < n; i++) {
                per[i] = sc.nextInt();
            }

            // Generate q by reversing p
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(per[i] + " ");
            }
            System.out.println();
            t--;
        }

    }
}
