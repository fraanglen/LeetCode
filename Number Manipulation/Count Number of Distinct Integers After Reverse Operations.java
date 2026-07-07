class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
            int rev=0;
            int n=num;
            while(n!=0){
                int dig=n%10;
                rev=rev*10+dig;
                n/=10;
            }
            set.add(rev);
        }
        return set.size();
    }
}