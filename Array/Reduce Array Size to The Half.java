class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>lst=new ArrayList<>(map.values());
        Collections.sort(lst,Collections.reverseOrder());
        int sum=0,count=0;
        for(int val:lst){
            sum+=val;
            count++;
            if(sum>=arr.length/2) break;
        }
        return count;
    }
}