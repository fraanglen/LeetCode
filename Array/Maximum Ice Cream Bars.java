/*class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        int sum=0;
        for(int i:costs){
            sum+=i;
            if(sum<=coins){
                count++;
            }       
    }
    return count;
}
}*/

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int i:costs){
            if(coins<i) break;
            coins-=i;
            count++;
        }
        return count;
    }
}