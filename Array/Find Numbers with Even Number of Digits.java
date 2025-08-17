class Solution {
    public int findNumbers(int[] nums) {
       List<String> list=new ArrayList<>();
        for(int num:nums){
            
            if(String.valueOf(num).length() % 2 == 0){
                list.add(String.valueOf(num));
            }
        }
        return list.size();
    }
}

/*class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
             if(String.valueOf(num).length() % 2 == 0){
                count++;
             }
        }
        return count;
    }
}*/

