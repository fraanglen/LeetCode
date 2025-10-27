class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] sq = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(sq);
        long sum = 0;
        int n = nums.length;
        int k = (n + 1) / 2;  

        for (int i = n - 1; i >= n - k; i--) {
            sum += sq[i];
        }
        for (int i = n - k - 1; i >= 0; i--) { 
            sum -= sq[i];
        }

        return sum;
    }
}