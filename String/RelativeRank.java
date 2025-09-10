class Solution {
    public String[] findRelativeRanks(int[] score) {
       int n=score.length;
       String[] res=new String[n];
       int[] sorted=score.clone();
       Arrays.sort(sorted);
       Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(sorted[n-i-1],i+1);
       }
       for(int i=0;i<n;i++){
        int rank=map.get(score[i]);
        if(rank == 1){
            res[i]="Gold Medal";
        }
        else if(rank == 2){
            res[i]="Silver Medal";
        }
        else if(rank == 3){
            res[i]="Bronze Medal";
        }
        else{
            res[i]=String.valueOf(rank);
        }
       }
       return res;
   }
}