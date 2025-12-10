package LeetCode.Number Manipulation;

public class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            if(i<=9){
                if(i%2==0){
                    count++;
                }
            }
            else{
                int temp=i;
                while(temp!=0){
                int digit=temp%10;
                sum+=digit;
                temp/=10;
            }
            if(sum%2==0){
                count++;
            }
            }
        }
        return count;
    }
} {
    
}
