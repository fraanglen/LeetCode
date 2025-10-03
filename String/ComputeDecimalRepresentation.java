class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer>lst=new ArrayList<>();
        int place=1;
        while(n!=0){
            int digit=n%10;
            if(digit!=0){
                lst.add(digit*place);
            }
            n/=10;
            place*=10;
        }
        Collections.reverse(lst);
        int[] res=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        return res;
    }
}