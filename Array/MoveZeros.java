/*class Solution {
    public void moveZeroes(int[] nums) {
        Arrays.sort(nums);
        int nonZeroIndex=0;
        for(int current=0;current<nums.length;current++){
            if(nums[current]!=0){
                int temp=nums[current];
                nums[current]=nums[nonZeroIndex];
                nums[nonZeroIndex]=temp;
                nonZeroIndex++;


            }
        }
        
    }
}
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}
s