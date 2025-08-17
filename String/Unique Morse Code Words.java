class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String>s=new HashSet<>();
        for(int i=0;i<words.length;i++){
           String str=words[i];
           String s1="";
           for(int j=0;j<str.length();j++){
            s1+=String.valueOf(arr[str.charAt(j)-'a']);
            
           }
           s.add(s1);
        }
        return s.size();
    }
}