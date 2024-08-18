package AComponentPractice;

public class Leetcode_3169 {
    public static void main(String[] args) {
        int[][] meetings={{3,4},{4,8},{2,5},{3,8}};
        int days=5;
        int sum=0;
//        System.out.println(meetings[0][1]-meetings[0][0] + 1 );
        for(int i=0;i<meetings.length;i++){
            sum +=(meetings[i][1]-meetings[i][0])+1;
        }
        System.out.println( Math.abs(days-sum) );
    }
}
