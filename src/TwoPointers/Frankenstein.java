package TwoPointers;

import java.util.*;

public class Frankenstein {

    private static Map<String, List<List<String>>> book = new HashMap<>();
    private static Map<String, Integer> map = new HashMap<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String l = sc.nextLine();
            String[] parts = l.split("=");
            String potion = parts[0];
            String[] ingredients = parts[1].split("\\+");
            book.putIfAbsent(potion, new ArrayList<>());
            book.get(potion).add(Arrays.asList(ingredients));
        }
        String P = sc.nextLine();
        sc.close();
        int result = helper(P);
        System.out.print(result);
    }
    private static int helper(String p) {
        if (!book.containsKey(p)) {
            return 0;
        }
        if (map.containsKey(p)) {
            return map.get(p);
        }
        int res = Integer.MAX_VALUE;
        for (List<String> recipe : book.get(p)) {
            int orbsReq = recipe.size() - 1;
            for (String i : recipe) {
                orbsReq += helper(i);
            }
            res = Math.min(res, orbsReq);
        }
        map.put(p, res);
        return res;
    }
}