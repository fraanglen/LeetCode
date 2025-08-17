class Solution {
    public int minimizedStringLength(String s) {
       HashSet<Character>uniqueChars=new HashSet<>();
       for (char c : s.toCharArray()) {
        uniqueChars.add(c);
       }
       return uniqueChars.size();
    }
}