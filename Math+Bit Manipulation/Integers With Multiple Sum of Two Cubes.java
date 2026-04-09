class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int temp=n;
        Map<Integer,Integer>map=new HashMap<>();
        for(int a=1;a*a*a<=n;a++){
            for(int b=a;b*b*b<=n;b++){
                int sum=a*a*a+b*b*b;
                if(sum > n) break;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        List<Integer>lst=new ArrayList<>();
        for(Map.Entry<Integer,Integer>map1:map.entrySet()){
            if(map1.getValue()>=2){
                lst.add(map1.getKey());
            }
        }
        Collections.sort(lst);
        return lst;
    }
}