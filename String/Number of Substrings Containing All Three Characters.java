class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int i=0;
        int[] charCount=new int[3];
        for(int j=0;j<s.length();j++){
            charCount[s.charAt(j)-'a']++;
            while(charCount[0]>0 && charCount[1]>0 && charCount[2]>0){
                count+=s.length()-j;
                charCount[s.charAt(j)-'a']--;
                i++;
            }
        }
        return count;
    }
}