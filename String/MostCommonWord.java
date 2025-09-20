class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String>ban=new HashSet<>();
        for(String s:banned){
            ban.add(s);
        }
        Map<String,Integer>map=new HashMap<>();
         for(String word:paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ")){
            if(!ban.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);
            }
         }
         map.remove("");
         String res="";
         for(String key:map.keySet()){
            if(res.equals("") || map.get(key) > map.get(res)){
                res=key;
            }
         }
         return res;

    }
}