class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>lst=new ArrayList<>();
        for(int num:nums){
            String s=String.valueOf(num);
            for(char ch:s.toCharArray()){
                lst.add(Character.getNumericValue(ch));
            }
        }
        int index=0;
        int[] arr=new int[lst.size()];
        for(int i:lst){
            arr[index++]=i;
        }
        return arr;
    }
}


class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int x: nums) sb.append(x);
        String str = sb.toString();
        int[] res = new int[str.length()];
        for(int i=0;i<res.length;i++){
            res[i] = str.charAt(i)-'0';
        }
        return res;
    }
}