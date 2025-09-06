class Solution {
    public boolean wordPattern(String pattern, String s) {
     String[] words = s.split(" ");
     if (pattern.length() != words.length){
        return false;
     }
     Map<Object, Integer> map = new HashMap<>(); 
     for (int i = 0; i < words.length; i++) {
        Character c = pattern.charAt(i);
        String w = words[i];
        if (!Objects.equals(map.put(c, i), map.put(w, i))){
            return false;
     }
    }
        return true;
    }
}
