package TwoPointers;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JustifyWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String[] w = new String[k];
        for (int i = 0; i < k; i++) w[i] = sc.nextLine();
        int n = sc.nextInt(), m = sc.nextInt(), c = 0, l = 0, cl = 0;
        for (String x : w) {
            if (cl + x.length() + (cl > 0 ? 1 : 0) <= m) {
                cl += x.length() + (cl > 0 ? 1 : 0);
                c++;
            } else {
                l++;
                if (l == n) break;
                cl = x.length();
                c++;
            }
        }
        if (cl > 0) {
            l++;
            if (l > n) c -= (l - n);
        }
        System.out.print(c);
    }
}
//
//import java.util.*;
//
//public class FrankensteinPotionBrewer {
//
//    private static Map<String, List<List<String>>> recipeBook = new HashMap<>();
//    // Telegram - @PLACEMENTLELO
//    private static Map<String, Integer> memo = new HashMap<>();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        scanner.nextLine();
//// Telegram - @PLACEMENTLELO
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            String[] parts = line.split("=");
//
//            String potion = parts[0];
//            String[] ingredients = parts[1].split("\\+");
//// Telegram - @PLACEMENTLELO
//            recipeBook.putIfAbsent(potion, new ArrayList<>());
//            recipeBook.get(potion).add(Arrays.asList(ingredients));
//        }
//
//        String targetPotion = scanner.nextLine();
//        scanner.close();
//
//        int result = minOrbsToBrew(targetPotion);
//        System.out.println(result);
//    }
//
//    private static int minOrbsToBrew(String potion) {
//
//        if (!recipeBook.containsKey(potion)) {
//            return 0;
//        }
//// Telegram - @PLACEMENTLELO
//        if (memo.containsKey(potion)) {
//            return memo.get(potion);
//        }
//
//        int placementlelo = Integer.MAX_VALUE;
//
//        for (List<String> recipe : recipeBook.get(potion)) {
//            int orbsRequired = recipe.size() - 1;
//
//            for (String ingredient : recipe) {
//                orbsRequired += minOrbsToBrew(ingredient);
//            }
//// Telegram - @PLACEMENTLELO
//            placementlelo = Math.min(placementlelo, orbsRequired);
//        }
//
//        memo.put(potion, placementlelo);
//        return placementlelo;
//    }
//}