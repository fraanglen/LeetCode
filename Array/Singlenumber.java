/*public class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
       for(int i=0;i<nums.length;i++){
        result^=nums[i];
       }
       return result;
    }
}
*/

/*public class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}
*/

public class Solution {
    public int singleNumber(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
             if(set.contains(num)) {
                set.remove(num);
             } 
             else{
                set.add(num);
             }
        }
        
      return  set.iterator().next();
    }
}
/*in HashSet we can return the singlt element in array only through set.iterator().next();
because unlike ArryaList() set.get(i) is not in HashSet */
