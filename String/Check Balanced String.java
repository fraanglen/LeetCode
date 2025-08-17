class Solution {
    public boolean isBalanced(String num) {
        int oddSum=0;
        int evenSum=0;
        for(int i=0;i<num.length();i++){
            int digit=Character.getNumericValue(num.charAt(i));
            if(i%2==0){
                evenSum+=digit;
            }
            else{
                oddSum+=digit;
            }
        }
        return oddSum == evenSum;
    }
}