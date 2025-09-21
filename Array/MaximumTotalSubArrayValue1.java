class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            max=Math.max(n,max);
            min=Math.min(n,min);
        }
         return (long) k*(max - min);
    }
}