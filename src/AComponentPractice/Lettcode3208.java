package AComponentPractice;

public class Lettcode3208 {
    public static void main(String[] args) {
        int[] arr=new int[100001];
                System.out.println(numberOfAlternatingGroups(arr,31623));
    }
    public static  int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length, count = 0;
        for(int i=0; i<n; i++){
            int prev = colors[i], j = i+1, cnt = k-1;
            boolean flag = true;
            while(true){
                if(cnt == 0) break;
                if(colors[j%n] == prev){
                    flag = false;
                    break;
                }
                prev = colors[j%n];
                j++;
                cnt--;
            }
            if(flag) count++;

        }
        return count;
   }

}
