class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Character>stk=new Stack<>();
       StringBuilder sb=new StringBuilder();
       for(char c:num.toCharArray()){
        while(k>0 && !stk.isEmpty() && stk.peek()>c){
            stk.pop();
            k--;
        }
        stk.push(c);
       } 
       while(k>0){
        stk.pop();
        k--;
       }
       for(char c:stk){
        if(sb.length()==0 && c=='0') continue;
        sb.append(c);
       }
       return sb.length()==0?"0":sb.toString();
    }
}