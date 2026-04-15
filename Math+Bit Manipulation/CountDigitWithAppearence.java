class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int num:nums){
            for(char ch:String.valueOf(num).toCharArray()){
                if(ch==digit){
                    count++;
                }
            }
        }
        return count;
    }
}

/*class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int n:nums){
            while(n>0){
            int val=n%10;
            if(val==digit) {
                count++;
            }
        
             n/=10;
        }
    }
    return count;
    }
}
*/