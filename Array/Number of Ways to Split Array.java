class Solution {
    public int waysToSplitArray(int[] nums) {
     long sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
       } 
       int count=0;
       long prefix=0;
       for(int i=0;i<nums.length-1;i++){
        prefix+=nums[i];
        if(prefix>=(sum-prefix)){
            count++;
        }
       }
       return count;
    }
}