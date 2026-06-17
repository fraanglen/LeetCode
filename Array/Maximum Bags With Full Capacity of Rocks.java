class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
      int n=capacity.length;
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=capacity[i]-rocks[i];
      }  
      Arrays.sort(arr);
      int count=0;
      for(int i=0;i<n;i++){
        if(additionalRocks>=arr[i]){
            additionalRocks-=arr[i];
            count++;
        }
      }
      return count;
    }
}