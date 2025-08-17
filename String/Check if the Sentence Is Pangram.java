class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
        set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}



class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        for(int i='a';i<'z';i++){
            if(sentence.indexOf(i) == -1){
                return false;
            }
        }
        return true;
    }
}
