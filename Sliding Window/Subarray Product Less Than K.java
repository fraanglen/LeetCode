public /*class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
            product*=nums[j];
            if(product>=k) break;
            count++;
            }
        }
        return count;
    }
}*/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s=0,product=1,count=0;
        if(k<=1) return 0;
        for(int e=0;e<nums.length;e++){
            product*=nums[e];
            while(product>=k){
                product/=nums[s];
                s++;
            }
            count+=(e-s)+1;
        }
        return count;
    }
} {
    
}
