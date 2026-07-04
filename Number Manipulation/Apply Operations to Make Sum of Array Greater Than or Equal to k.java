class Solution {
    public int minOperations(int k) {
        int sq=(int)Math.sqrt(k);
        return sq+(k-1)/sq-1;
    }
}