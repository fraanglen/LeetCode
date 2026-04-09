class Solution {
    public int countCommas(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            int dig=String.valueOf(i).length();
            count+=(dig-1)/3;
        }
        return count;
    }
}