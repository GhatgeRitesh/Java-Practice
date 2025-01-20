package TwoPointers;

public class subarrays {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i < nums.length; i++){
            for(int j=i;j<nums.length;j++){
                System.out.print(nums[j]+",");
            }
            System.out.println(" ");
        }
    }
}
