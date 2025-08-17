class Solution {
    public int firstUniqChar(String s) {
     for(int i=0;i<s.length();i++){
       int c=s.charAt(i);
       if(i==s.indexOf(c) && i==s.lastIndexOf(c))
       return i;
     }   
     return -1;
    }
}First Unique Character in a String