class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int mod=(sum%k+k)%k;
            count+=map.getOrDefault(mod,0);
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return count;
    }
}