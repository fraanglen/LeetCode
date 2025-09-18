public class Solution {
    public boolean canAliceWin(int[] nums) {
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k] < 10){
                j+=nums[k];
            }
            else{
                i+=nums[k];
            }
        }
        if(i == j){
            return false;
        }
        return true;
    }
} {
    
}
