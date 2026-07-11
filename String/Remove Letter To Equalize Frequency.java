class Solution {
    public boolean equalFrequency(String word) {
        int[] arr=new int[26];
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                continue;
            }
            arr[i]--;
            if(isValid(arr)){
                return true;
            }
            arr[i]++;
        }
        return false;
    }
    private boolean isValid(int[] arr){
        int exp=0;
        for(int f:arr){
            if(f==0){
                continue;
            }if(exp==0){
                exp=f;
            }else if(f!=exp){
                return false;
            }
        }
        return true;
    }
}