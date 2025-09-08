/*class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        res[0]=n*(1-n)/2;
        for (int i=1;i<n;i++)
            res[i]=i;
        return res;
    }
}
*/

class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        for(int i=0;i<n/2;i++){
           res[i]=-(i+1);
           res[n-i-1]=i+1; 
        }
        return res;
    }
}