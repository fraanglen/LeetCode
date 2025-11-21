/*class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int div=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            else{
                max=nums[i];
            }
        }
        for(int i=1;i<=min && i<=max;i++){
            if(min%i==0 && max%i==0){
                div=i;
            }
        }
        return div;
    }
}
*/

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        while(max%min !=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        return min;
    }
}