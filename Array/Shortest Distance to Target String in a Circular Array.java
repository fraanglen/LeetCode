/*class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
            int right=(i-startIndex+n)%n;
            int left=(startIndex-i+n)%n;
            min=Math.min(min,Math.min(left,right));
    }
        }
    return min==Integer.MAX_VALUE?-1:min;
}
}
*/

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int diff=Math.abs(i-startIndex);
                int diff1=Math.min(diff,n-diff);
                min=Math.min(min,diff1);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}