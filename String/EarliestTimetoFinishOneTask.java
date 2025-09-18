class Solution {
    public int earliestTime(int[][] tasks) {
        int earliest=Integer.MAX_VALUE;
        for (int[] task:tasks) {
            int start=task[0];
            int duration=task[1];
            int finish=start+duration;
            earliest=Math.min(earliest, finish);
        }
        
        return earliest;
    }
}
