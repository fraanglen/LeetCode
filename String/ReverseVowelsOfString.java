public class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i= 0, j= ch.length - 1;
        while (i < j) {
            while (i <j && !isVowel(ch[i])) {
                i++
            }
            while (i < j && !isVowel(ch[j])) {
                j--;
            }
            if (i < j) { 
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
      return new String(ch);
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
 ReverseVowelsOfString {
    
}
