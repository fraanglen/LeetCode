/*class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int left=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            int temp=nums[left];
            nums[left]=nums[i];
            nums[i]=temp;
            left++;
        }
      }
      return nums;
    }
}
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int oddIndex=nums.length-1;
        int evenIndex=0;
        for(int num:nums){
            if(num%2==0){
               arr[evenIndex]=num;
               evenIndex++;  
            }
            else{
                arr[oddIndex]=num;
                oddIndex--;
            }
        }
        return arr;
    }
}