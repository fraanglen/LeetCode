class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length && j<=i+k;j++){
          if(nums[i]==nums[j])
            return true;
           }
          }
          return false;
    }
    }

    /*
    i=0,1,2 k=3
    j<=i+k 0+3=3....1+3=4 IT STOPS THE ITERATION BEFORE INDEX 4 
    */