class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0,j=0;i<s.length();i=j){
            while(j < s.length() && s.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j-i >= 3){
                lst.add(Arrays.asList(i,j-1));
            }
        }
        return lst;
    }
}