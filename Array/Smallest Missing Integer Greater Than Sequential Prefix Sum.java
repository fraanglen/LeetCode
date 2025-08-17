class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
         if(nums[i] == nums[i-1]+1){
            sum+=nums[i];
        }
        else{
            break;
        }
        }
        HashSet set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}
nums[i] == nums[i - 1] + 1 (checks tha given order is sequential or not)
sum+=nums[i];(in it is sequential then it add to sum like 3 then 6 )
Start: sum = 1

i = 1: nums[1] = 2, nums[0] + 1 = 2 → ✅ → sum = 1 + 2 = 3

i = 2: nums[2] = 3, nums[1] + 1 = 3 → ✅ → sum = 3 + 3 = 6

i = 3: nums[3] = 5, nums[2] + 1 = 4 → ❌ → sequence breaks → loop ends

✅ So the longest sequential prefix is [1, 2, 3], and sum = 6.