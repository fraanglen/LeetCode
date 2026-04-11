class Solution {
    public int minimumDistance(int[] nums) {
       int n=nums.length;
       int[] last=new int[n+1];
       int[] secLast=new int[n+1];
       for(int i=0;i<=n;i++){
        last[i]=-1;
        secLast[i]=-1;
       }
       int res=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        int num=nums[i];
        if(secLast[num]!=-1){
            res=Math.min(res,2*(i-secLast[num]));
        }
        secLast[num]=last[num];
        last[num]=i;
       }
       return res==Integer.MAX_VALUE?-1:res;
    }
}