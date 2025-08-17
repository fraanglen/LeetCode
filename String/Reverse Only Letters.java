class Solution {
    public String reverseOnlyLetters(String s) {
        String rev = "";
        int nonLetter = s.length() - 1;
        for (int i = 0; i < s.length; i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (!Character.isLetter(s.charAt(nonLetter))) {
                    nonLetter--;
                }
                rev += s.charAt(nonLetter--);
            } else {
                rev += s.charAt(i);
            }
        }
       return rev;
    }
}
/*class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
           if(!Character.isLetter(str[left])){
                    left++;
                }
                else if(!Character.isLetter(str[right])){
                    right--;
                }
                else{
                    char temp=str[left];
                    str[left]=str[right];
                    str[right]=temp;
                    left++;
                    right--;
                }
            }
        return new String(str);
    }
}
*/