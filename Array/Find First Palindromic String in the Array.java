/*class Solution {
    public String firstPalindrome(String[] words) {
        for(String seperateString:words){
            if(isPalindrome(seperateString)){
                return seperateString;
            }
        }
        return "";
    }
    private boolean isPalindrome(String words){
        int left=0;
        int right=words.length()-1;
        while(left<right){
            if(words.charAt(left)!=words.charAt(right)){
               return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}
*/

class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            StringBuilder reverse=new StringBuilder(word).reverse();
            if(word.equals(reverse.toString())){
                return word;
            }
        }
        return "";
    }
}