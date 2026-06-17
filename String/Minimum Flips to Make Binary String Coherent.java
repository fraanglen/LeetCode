class Solution {
    public int minFlips(String s) {
        int n=s.length();
        int res=n;
        for (int split=0;split<=n;split++) {
            int flip=0;
            for (int i=0;i<split;i++) {
                if (s.charAt(i)=='1') {   
                    flip++;
                }
            }
            for(int i=split;i<n;i++) {
                if (s.charAt(i)=='0') {   
                    flip++;
                }
            }
            res=Math.min(res,flip);      
        }
        for(int split=0;split<=n;split++) {
            int flip=0;
            for (int i=0;i<split;i++) {
                if (s.charAt(i)=='0') {   
                    flip++;
                }
            }
            for(int i=split;i<n;i++) {  
                if (s.charAt(i)=='1') {     
                    flip++;
                }
            }
            res=Math.min(res,flip);         
        }
        return res;
    }
}