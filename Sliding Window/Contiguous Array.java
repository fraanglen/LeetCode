/*class Solution {
    public int findMaxLength(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ones=0,zeros=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zeros++;
                }else{
                    ones++;
                }
                if(zeros==ones){
                    count=Math.max(count,j-i+1);
                }
            }
        }
        return count;
        }
}*/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}