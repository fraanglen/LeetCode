// in every iteration, flip to first get the max element at beginning of the list and then flip to put this element in length -iteration pos

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res=new ArrayList<Integer>();
        int inc=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                inc=1;
                break;
            }
        }
        if(inc==0)//check for allready sorted
        return new ArrayList<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            int midx=midx(arr,i);// get index of max ele in array [0,i]
            res.add(midx+1);
            arr=flip(arr,midx);// flip from start to max index
            res.add(i+1);
            arr=flip(arr,i);// flip from start to size left
        }
        return res;
    }
    public int[] flip(int arr[], int idx){
        for(int i=0;i<=idx/2;i++){
            int t=arr[i];
            arr[i]=arr[idx-i];
            arr[idx-i]=t;
        }
        return arr;
    }
    public int midx(int[] arr, int i){
        int idx=0;
        int max=arr[0];
        for(int j=0;j<=i;j++){
            if(arr[j]>max){
                max=arr[j];
                idx=j;
            }
        }
        return idx;
    }
}