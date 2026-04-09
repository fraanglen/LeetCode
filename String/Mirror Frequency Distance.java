class Solution {
    public int mirrorFrequency(String s) {
        int[] fq=new int[36];
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                fq[ch-'a']++;
            }else{
                fq[26+(ch-'0')]++;
            }
        }
        boolean[] bool=new boolean[36];
        int res=0;
        for(int i=0;i<36;i++){
            if(bool[i] || fq[i] == 0) continue;
            int Index=getIndex(i);
            int f1=fq[i];
            int f2=fq[Index];
            res+=Math.abs(f1-f2);
            bool[i]=true;
            bool[Index]=true;
        }
        return res;
    }
    private int getIndex(int i){
        if(i<26){
            return 25-i;
        }else{
            return 26+(9-(i-26));
        }
    }
}