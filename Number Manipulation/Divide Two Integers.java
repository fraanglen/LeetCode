/*class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
        return Integer.MAX_VALUE;
        }
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int count=0;
        while(a>=b){
            a=a-b;
            count++;
        }
        if(dividend<0 && divisor>0 || dividend>0 && divisor<0){
            count=-count;
        }
        return count;
    }
}
*/
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE && divisor==1) return Integer.MIN_VALUE;
        int res=dividend/divisor;
        return res;
    }
}