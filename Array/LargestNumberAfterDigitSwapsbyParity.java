class Solution {
    public int largestInteger(int num) {
        List<Integer>lst=new ArrayList<>();
        int temp=num;
        while(temp>0){
            lst.add(temp%10);
            temp/=10;
        }
        Collections.reverse(lst);
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        for(int i:lst){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd,Collections.reverseOrder());
        }
        int res=0;
        int evenIndex=0 , oddIndex=0;
        for(int d:lst){
           res*=10;
           if(d%2==0){
            res+=even.get(evenIndex++);
           }
           else{
            res+=odd.get(oddIndex++);
           }
        }
        return res;
    }
}
