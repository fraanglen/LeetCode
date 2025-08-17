class Solution {
    public int thirdMax(int[] nums) {
        
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            set.add(nums[i]);
            if(set.size() == 3){
                return nums[i];
            }
        }
        return nums[nums.length-1];

    }
}