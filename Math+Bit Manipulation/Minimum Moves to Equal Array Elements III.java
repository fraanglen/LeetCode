class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(num,max);
        }
        int total=0;
        for(int i=0;i<nums.length;i++){
        total+=max-nums[i];
        }
        return total;
    }
}