public class Solution {
    public int maxDistance(String moves) {
        int a=0,b=0,k=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') b++;
            else if(ch=='D') b--;
            else if(ch=='L') a++;
            else if(ch=='R') a--;
            else k++;
        }
        return Math.abs(a)+Math.abs(b)+k;
    }
} {
    
}
