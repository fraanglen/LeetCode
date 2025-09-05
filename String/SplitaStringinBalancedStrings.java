class Solution {
    public int balancedStringSplit(String s) {
        int bal=0;
        int count=0;
        for(char c:s.toCharArray()){
            if(c == 'L'){
                bal++;
            }
            else{
                bal--;
            }
            if(bal == 0){
                count++;
            }
        }
        return count;
    }
}