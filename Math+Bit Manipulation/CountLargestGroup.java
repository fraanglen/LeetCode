class Solution {
    public int countLargestGroup(int n) {
      Map<Integer,Integer>map=new HashMap<>();
      int count=0;
      for(int i=1;i<=n;i++){
        int dig=sumDigit(i);
        map.put(dig,map.getOrDefault(dig,0)+1);
      }
      int max=0;
      for(int value:map.values()){
        max=Math.max(max,value);
      }
      for(int group:map.values()){
        if(group==max){
            count++;
        }
      }
      return count;
    }
    private int sumDigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}