class Solution {
    public int mostWordsFound(String[] sentences) {
      int maxCount=0;
      for(String sentence:sentences) {
        int wordCount=sentence.split(" ").length;
        if(wordCount>maxCount){
            maxCount=wordCount;
        }
      } 
      return maxCount;
    }
}
