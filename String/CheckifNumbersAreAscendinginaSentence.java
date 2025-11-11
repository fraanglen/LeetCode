class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        int num=0;
        for(String word:str){
            if(Character.isDigit(word.charAt(0))){
                int n=Integer.parseInt(word);
                if(n<=num){
                    return false;
                }
                num=n;
            }
        }
        return true;
    }
}