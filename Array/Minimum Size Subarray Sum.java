class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                minLen=Math.min(minLen,j-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE?0:minLen;
    }
}