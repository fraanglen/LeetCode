class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer>lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            lst.add(arr[i]);
            if(arr[i]==0)lst.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++ )
        arr[i] = lst.get(i);     
    }
}
