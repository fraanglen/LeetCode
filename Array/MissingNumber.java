class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        for(i=0;i<=n-1;i++){
            if(i!=nums[i]){
                return i;

            }
        }
        int ans=i;
        return ans;
    
    }
}