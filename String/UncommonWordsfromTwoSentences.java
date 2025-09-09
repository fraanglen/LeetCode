class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
     List<String>lst1=new ArrayList<>();
     List<String>lst2=new ArrayList<>();
     for(String word1:s1.split(" ")){
        lst1.add(word1);
     }
     for(String word2:s2.split(" ")){
        lst2.add(word2);
     }
     List<String>res=new ArrayList<>();
     for(String w:lst1){
        if(!lst2.contains(w) && Collections.frequency(lst1,w) == 1){
            res.add(w);
        }
     }
     for(String w:lst2){
        if(!lst1.contains(w) && Collections.frequency(lst2,w) == 1){
            res.add(w);
        }
     }
       return res.toArray(new String[0]);
    }
}
