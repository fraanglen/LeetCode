class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int[] str=new int[128];
        for(int i=0;i<n;i++){
            str[s.charAt(i)]++;
        }
        while(sb.length()<n){
            int max=0;
            for(int i=0;i<128;i++){
            if(str[i]>str[max]){
                max=i;
            }
            }
            for(int i=0;i<str[max];i++){
                sb.append((char)max);
            }
            str[max]=0;
        }
        return sb.toString();
    }
}