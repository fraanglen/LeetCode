class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                return num;
            }
        }
        return -1;
    }
}

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num)){
                return num;
            }
        }
        return -1;
    }
}