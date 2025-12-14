class Solution {
    public int absDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int sSum=0;
        int lSum=0;
        for(int i=0;i<k;i++){
            sSum+=nums[i];
        }
        for(int i=n-k;i<n;i++){
            lSum+=nums[i];
        }
        int total=Math.abs(sSum-lSum);
        return total;
    }
}©leetcode