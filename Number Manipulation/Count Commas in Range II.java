/*class Solution {
    public long countCommas(long n) {
        long m=n;
        long count=0;
        for(int i=0;i<=m;i++){
            int dig=String.valueOf(i).length();
            if(dig>=4){
                count+=(dig-1)/3;
            }
        }
        return count;
    }
}
*/
class Solution {
    public long countCommas(long n) {
        long commaCount=1;
        long b=1000;
        long comma=0;
        while(b<=n){
            long  end=b*1000-1;
            long num=Math.min(n,end)-b+1;
            if(num>0){
                comma+=num*commaCount;
            }
            b*=1000;
            commaCount++;
        }
        return comma;
    }
}