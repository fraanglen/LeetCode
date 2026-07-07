class Solution {
    public long dividePlayers(int[] skill) {
       Arrays.sort(skill);
       int sum=0;
       long product=0;
       int i=0,j=skill.length-1;
       sum=skill[i]+skill[j];
       while(i<j){
        if(sum!=skill[i]+skill[j]){
            return -1;
        }
        product+=(long)skill[i]*skill[j];
        i++;
        j--;
       }
       return product;
    }
}