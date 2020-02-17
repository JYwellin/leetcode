public class Solution {
    public static void main(String []args){
        int ans = twoSum(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(ans);
    }

    public static int twoSum(int[] nums) {
        int[] count = new int[nums.length];
        for(int i = 0;i < nums.length; i++)
            count[i] = 0;
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if (count[nums[i]] == 2) return nums[i];
        }
        throw new IllegalArgumentException("No solution");
    }
}
