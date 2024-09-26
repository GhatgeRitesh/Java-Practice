package TwoPointers;

public class check1 {
    public static void main(String[] args) {
        int[] list={7,57,13,31,17,65,32,3,97,22,7,20,69,35,69,75,13,33,50,80,64,71,15,28,2,27,39,48,13,22,84,5,51,46,26,78,56,63};
        int max=0;
        for(int i=0,j=list.length-1;i<list.length/2;i++,j--){
            max=Math.max(list[i]+list[j],max);
        }
        System.out.println(max);
    }
}
