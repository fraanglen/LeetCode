/*class Solution {
    public int minimumMoves(String s) {
        int count=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                count++;
                i+=3;
            }
            else{
                i++;
            }
        }
        return count;
    }
}
*/
class Solution {
    public int minimumMoves(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        int i=0;
        if(i<sb.length()){
            count++;
            for(int j=i;j<i+3;j++){
                sb.setCharAt(j,'0');
                i+=3;
            }
            }
            else{
                i++;
            }
            return count;
    }
}

