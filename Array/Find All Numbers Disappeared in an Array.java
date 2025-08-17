class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      
      boolean[] seen=new boolean[nums.length+1];
      List<Integer> result = new ArrayList<>();
      
      for(int i=0;i<nums.length;i++){
        int num=nums[i];
        seen[num]=true;
      }
      for(int i=1;i<=nums.length;i++){
        if(!seen[i]){
            result.add(i);
        }
        
      }
      return result;
    }
}


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen=new boolean[nums.length+1];
        List<Integer>result=new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            seen[num]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!seen[i]){
                result.add(i);
            }
        }
        return result;
    }
}