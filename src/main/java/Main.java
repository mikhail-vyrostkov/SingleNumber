public class Main {
    public static void main(String[] args){
        int[] nums = {2, 3, 2, 3, 1};
        System.out.println(Solution.singleNumber(nums));
      }

    public static class Solution {
        public static int singleNumber(int[] nums) {
            int x = nums[0];
            for (int i = 1; i < nums.length; i++) {
                x ^= nums[i];
            }
            return x;
        }
    }
}
