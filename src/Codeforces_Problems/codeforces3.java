import java.util.Scanner;

public class codeforces3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();
            
            int[][] intervals = new int[n][2];
            
            for (int j = 0; j < n; j++) {
                intervals[j][0] = sc.nextInt();
                intervals[j][1] = sc.nextInt();
            }
            
            System.out.println(canShower(n, s, m, intervals) ? "YES" : "NO");
        }
        
        sc.close();
    }
    
    private static boolean canShower(int n, int s, int m, int[][] intervals) {
        // Check the time before the first task
        if (intervals[0][0] >= s) {
            return true;
        }
        
        // Check the time between tasks
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] - intervals[i-1][1] >= s) {
                return true;
            }
        }
        
        // Check the time after the last task
        if (m - intervals[n-1][1] >= s) {
            return true;
        }
        
        return false;
    }
}
