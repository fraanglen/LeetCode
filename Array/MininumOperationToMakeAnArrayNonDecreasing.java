class Solution {
    public long minOperations(int[] nums) {
        long count=0;
        int n=nums.length;
        for(int i=0;i<=n-2;i++){
            if(nums[i]>nums[i+1]){
                count+=nums[i]-nums[i+1];
            }
        }
        return count;
    }
}