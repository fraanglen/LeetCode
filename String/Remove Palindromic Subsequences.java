/*class Solution {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0; // If empty, no steps needed
        if (isPalindrome(s)) return 1; // If palindrome, remove in one step
        return 2; // Otherwise, it takes at most two steps
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Mismatch means not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}
*/

/*class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0)return 0;
        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
            if(s.charAt(i)!=s.charAt(j)) return 2;
            return 1;
        
    }
}
*/

class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0)return 0;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) {
                return 2;
            }
            i++;
            j--;
        }
        return 1;
        }
}


