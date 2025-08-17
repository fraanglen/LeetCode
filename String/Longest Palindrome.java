class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>set=new HashSet<>();
        int length=0;
        for(char c:s.toCharArray()){
          if(set.contains(c)){
            length+=2;
            set.remove(c);
          }
          else{
            set.add(c);
          }
          
          }
          if (!set.isEmpty()) {
            length+=1;
        }
        return length;
    }
}

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>charCount=new HashMap<>();
        for(char c:s.toCharArray()){
          charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
          int length=0;
          boolean hasOdd=false;
          for (int count : charCount.values()) {
            if(count%2==0){
                length+=count;
            }
            else{
                length+=count-1;
                hasOdd=true;
            }
          }
          return hasOdd?length+1:length;
        
    }
}


class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>charCount=new HashMap<>();
        for(char c:s.toCharArray()){
          charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
          int length=0;
          int oddFlag=0;
          for (int count : charCount.values()) {
            length+=(count/2)*2;
            oddFlag |=count%2;
          }
          return length+oddFlag;
     }
}

