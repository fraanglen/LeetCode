/*class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        for(int i=0;i<=n-1;i++){
           if(nums[i]!=i+1){
            return false;
           }
        }
        return nums[n]==n?true:false;
    }
}
*/

class Solution{
    public boolean isGood(int[] nums){
        Arrays.sort(nums);
        int n=nums.length-1;
        
            return nums[n]==n && nums[n-1]==n?true:false;
        
    }
}