class Solution {
    public boolean isPrime(int num){
        if(num <=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public long splitArray(int[] nums) {
        long sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(i)){
                sum1+=nums[i];
            }else{
                sum2+=nums[i];
            }
        }
        return Math.abs(sum1-sum2);
    }
}
