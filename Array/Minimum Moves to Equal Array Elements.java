class Solution {
    public int minMoves(int[] nums) {
         int sum=0;
         int min=nums[0];
         for(int i:nums){
            min=Math.min(i,min);
         }                     
         for(int i=0;i<nums.length;i++){
            sum+=nums[i]-min;
         }
         return sum;          
    }
}