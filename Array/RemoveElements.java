/*class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return i;
    }
}
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer>lst=new ArrayList<>();
        for(int num:nums){
            if(num!=val){
                lst.add(num);
            }
           }
           for(int i=0;i<lst.size();i++){
            nums[i]=lst.get(i);
           }
        return lst.size();
    }
}