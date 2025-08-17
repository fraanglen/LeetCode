/*class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> lst = new ArrayList<>();
        for (int[] row : grid) {
            for (int num : row) {
                lst.add(num);
            }
        }
        
        Collections.sort(arr);
        int median = lst.get(lst.size() / 2);
        int operations = 0;

        for (int num : lst) {
            int diff = Math.abs(num - median);
            if (diff % x != 0) return -1;
            operations += diff / x;
        }
        return operations;
    }
}
*/
class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer>lst=new ArrayList<>();
        for(int[] row:grid){
            for(int num:row){
                lst.add(num);
            }
        }
        Collections.sort(lst);
        int median=lst.get(lst.size()/2);
        int operation=0;

        for(int num:lst){
            int diff=Math.abs(num-median);
            if(diff%x!=0){
                return -1;
            }
            operation+=diff/x;
        }
        return operation;
    }
}