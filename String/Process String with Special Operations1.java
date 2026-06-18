class Solution {
    public String processStr(String s) {
        String res="";
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(arr[i])){
               res+=arr[i];
            }
            else if(arr[i]=='*'){
                if(res.length()>0){
                    res=res.substring(0,res.length()-1);
                }
            }
            else if(arr[i]=='#'){
                res += res;
            }
            else if(arr[i]=='%'){
                res=new StringBuilder(res).reverse().toString();
            }
        }
        return res;
    }
}