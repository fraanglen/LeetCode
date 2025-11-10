class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer>set=new HashSet<>();
       for(int val:arr1){
        String str=val+"";
        int len=str.length();
        for(int i=0;i<len;i++){
            int cur=Integer.parseInt(str.substring(0,i+1));
            set.add(cur);
        }
       }
       int count=0;
       for(int val:arr2){
        String str=val+"";
        int len=str.length();
        for(int i=count;i<len;i++){
            int cur=Integer.parseInt(str.substring(0,i+1));
            if(set.contains(cur)){
            count++;
            }
        }
       }
       return count;
    }
}