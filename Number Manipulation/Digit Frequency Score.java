class Solution {
    public int digitFrequencyScore(int n) {
        int num=0;
        while(n>0){
            int dig=n%10;
            num+=dig;
            n/=10;
        }
        return num;
    }
}