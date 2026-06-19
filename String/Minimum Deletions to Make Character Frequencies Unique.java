class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Set<Integer>set=new HashSet<>();
        int count=0;
        for(int val:map.values()){
            while(val>0 && set.contains(val)){
               val--;
               count++; 
            }
            set.add(val);
        }
       
       return count;
    }
}1647