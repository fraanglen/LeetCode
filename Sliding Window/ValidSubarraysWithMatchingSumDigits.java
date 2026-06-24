class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int[] arr=nums;
        int count=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                long temp=sum;
                int lDigit=(int)(temp%10);
                while(temp>=10){
                    temp/=10;
                }
                int fDigit=(int)temp;
                if(fDigit==x && lDigit==x){
                    count++;
                }
            }
        }
        return count;
    }
}