class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String add=s+s;
        return add.substring(1,add.length()-1).contains(s);
    }
}

add=abababab
add.substring(1,7)  (bababa) first a and last b is trimed
then abab is checked in bababa