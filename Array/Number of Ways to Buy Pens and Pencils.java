class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways=0;
        for(int pen=0;pen*cost1<=total;pen++){
            int rem=total-pen*cost1;
            ways+=(rem/cost2)+1;
        }
        return ways;
    }
}