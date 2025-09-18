class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1;  //i
        int currentWidth=0;   //j
        for(Character ch:s.toCharArray()){
          int w=widths[ch - 'a'];
          if(currentWidth + w > 100){
          currentWidth = w;
          line++;
          }
          else{
            currentWidth+=w;
          }
        }
        return new int[]{line,currentWidth};
    }
}