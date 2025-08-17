class Solution {
    public int countSegments(String s) {
        if (s.trim().length() == 0) {
        return 0;
        }
        String seg[]= s.trim().split("\\s+");
        return seg.length;
    }
}