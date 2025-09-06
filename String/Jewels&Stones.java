/*class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>jwSet=new HashSet<>();
        for(char j:jewels.toCharArray()){
            jwSet.add(j);
        }
        int count=0;
        for(char s:stones.toCharArray()){
           if(jwSet.contains(s)){
            count ++ ;
           }
        }
        return count;
    }
}
*/


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch:stones.toCharArray()){
            if(jewels.indexOf(ch)!= -1){
                count++;
            }
        }
        return count;
    }
}