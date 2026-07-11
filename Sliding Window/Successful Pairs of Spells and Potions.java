class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        List<Integer>lst=new ArrayList<>();
        //long sum=0;
        for(int spell:spells){
             int count=0;
            for(int pot:potions){
              long sum=(long)spell*pot;
                if(sum>=success) count++; 
            }
             lst.add(count);
        }
        int[] res=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        return res;
    }
}

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
       Arrays.sort(potions);
       int[] arr=new int[spells+1];
       int left=0;
       int right= 
    }
}