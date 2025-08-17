

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
}





/*class Solution {
    public int sumOfUnique(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int sum=0;
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
                sum+=num;
            }
            else if(set.contains(num)){
                sum-=num;
                set.remove(num);
            }
        }
        return sum;
    }
}
*/