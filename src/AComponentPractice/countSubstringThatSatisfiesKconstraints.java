package AComponentPractice;

public class countSubstringThatSatisfiesKconstraints {
    public static void main(String[] args) {
        String s="10101";
        int k=0;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            int cnt0 = 0, cnt1 = 0;
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j)=='0') cnt0++;
                else cnt1++;
                if(cnt0 <= k || cnt1 <= k) cnt++;
                else{
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
