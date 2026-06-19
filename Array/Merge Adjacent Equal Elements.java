public /*class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long>lst=new ArrayList<>();
        for(int num:nums){
            long curr=num;
            while(!lst.isEmpty() && lst.get(lst.size()-1)==curr){
                curr=lst.remove(lst.size()-1) + curr;
            }
            lst.add(curr);
        }
        return lst;
    }
}*/

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long>stk=new Stack<>();
        for(int i=0;i<nums.length;i++){
            long val=nums[i];
            while(!stk.isEmpty() && stk.peek()==val){
                val=val*2;
                stk.pop();
            }
            stk.push(val);
        }
        return new ArrayList<>(stk);
    }
} {
    
}
