/*class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       return (nums[n-1]*nums[n-2] - nums[0]*nums[1]);
          
    }
}
*/

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int product1=0;
        int product2=0;
        for(int i=0;i<=n;i++){
            product1=nums[0]*nums[1];
            product2=nums[n-1]*nums[n-2];
        }
        return product2-product1;
    }
}

