class Solution {
    public int minLengthAfterRemovals(String s) {
        String str = s;  
        int countA = 0, countB = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a') {
                countA++;
            }
            else {
                countB++;
            }
        }
        return Math.abs(countA - countB);
    }
}