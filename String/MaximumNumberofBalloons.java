class Solution {
    public int maxNumberOfBalloons(String text) {
       int arr[]=new int[26];
       for(char ch:text.toCharArray()) {
        arr[ch - 'a']++;
       }
        int countB=arr['b'-'a'];
        int countA=arr['a'-'a'];
        int countL=arr['l'-'a']/2; 
        int countO=arr['o'-'a']/2; 
        int countN=arr['n'-'a'];
        return Math.min(Math.min(Math.min(countB, countA), Math.min(countL, countO)), countN);
    }
}


class Solution {
    public int maxNumberOfBalloons(String text) {
        int countB = 0, countA = 0, countL = 0, countO = 0, countN = 0;
        for(char ch:text.toCharArray()){
            if(ch=='b') countB++;
            else if(ch=='a') countA++;
            else if (ch=='l') countL++;
            else if (ch=='o') countO++;
            else if (ch=='n') countN++;
            }
            countL/=2;
            countO/=2;
            return Math.min(Math.min(Math.min(countB, countA), Math.min(countL, countO)), countN);
    }
}
