class Solution {
    public boolean checkGoodInteger(int n) {
        int sd=0;
        int sqd=0;
        while(n>0){
            int d=n %10;
            sd += d;
            sqd += d*d;
            n/=10;
        }
        return (sqd-sd)>=50;
    }
}