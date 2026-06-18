/*class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(temperatures[i]<temperatures[j]){
                    int sum=Math.abs(j-i);
                    arr[i]=sum;
                    break;
                    //i++;
                }
                //j++;
            }
           
        }
        return arr;
    }
}
*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int indx=s.pop();
                arr[indx]=i-indx;
            }
            s.push(i);
        }
        return arr;
    }
}


