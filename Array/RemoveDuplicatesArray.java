/*class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}

