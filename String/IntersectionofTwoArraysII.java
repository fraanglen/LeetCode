/*class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j]) && map.get(nums2[j]) > 0) {
                result.add(nums2[j]); 
                map.put(nums2[j], map.get(nums2[j]) - 1); 
            }
        }
        int[] output = new int[result.size()];
        int index = 0;
        for (int num : result) {
            output[index++] = num;
        }
        return output;
    }
}
*/

class Solution {
     public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(list1.contains(nums2[i])){
                list2.add(nums2[i]);
                list1.remove(Integer.valueOf(nums2[i]));
           }
        }
          int[] result=new int[list2.size()];
          for(int i=0;i<list2.size();i++){
            result[i]=list2.get(i);
          }
          return result;
     }
}
