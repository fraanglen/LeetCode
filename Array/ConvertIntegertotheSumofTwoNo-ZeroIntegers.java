/*class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[n];
        for(int a=1;a<n;a++){
          int b=n-a;
          if(isNonZero(a) && isNonZero(b)){
            return new int[]{a,b};
          }
     }
     return new int[]{};
    }
    private boolean isNonZero(int num){
        while(num > 0){
            if(num%10 == 0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}
*/

class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=0;a<n;a++){
            int b=n-a;
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")){
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }
}