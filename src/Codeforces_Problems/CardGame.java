import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            
            System.out.println(countSuneetWins(a1, a2, b1, b2));
        }
        sc.close();
    }

    private static int countSuneetWins(int a1, int a2, int b1, int b2) {
        int[] suneet = {a1, a2};
        int[] slavic = {b1, b2};

        int wins = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (suneet[i] > slavic[j]) {
                    wins++;
                }
            }
        }

        return (wins == 4) ? 4 : (wins == 3) ? 2 : (wins == 2) ? 2 : (wins == 1) ? 0 : 0;
    }
}
