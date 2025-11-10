class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int candy:candies){
            max=Math.max(max,candy);
        }
        List<Boolean>lst=new ArrayList<>();
        for(int candy:candies){
            if(candy+extraCandies >= max){
                lst.add(true);
            }
            else{
                lst.add(false);
            }
        }
        return lst;
    }
}