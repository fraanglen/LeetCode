/*class Solution {
    public long sumAndMultiply(int n) {
        long temp=n;
        long sum=0;
        StringBuilder sb=new StringBuilder();
        while(temp!=0){
            long digit=temp%10;
            sum+=digit;
            if(digit!=0)
            {
                sb.append(digit);
            }
            temp/=10;
        }
       long x=Long.parseLong(sb.reverse().toString());
       return x*sum;
    }
}
*/

class Solution {
    public long sumAndMultiply(int n) {
        int temp=n;
        int sum=0;
        int rev=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            if(digit!=0){
                rev=rev*10+digit;
            }
            temp/=10;
        }
        int original=0;
        while(rev>0){
        int d=rev%10;
        original=original*10+d;
        rev/=10;
    }
    return (long)original*sum;
    }
}