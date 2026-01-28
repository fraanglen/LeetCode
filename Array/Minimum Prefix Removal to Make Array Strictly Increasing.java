class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length-1;
        while(n>0 && nums[n] > nums[n-1]){
            n--;
        }
        return n;
    }
}