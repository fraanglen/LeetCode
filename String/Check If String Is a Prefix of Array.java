class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(String w:words){
            sb.append(w);
            if(s.equals(sb.toString())){
            return true;
        }
        }
        return false;
    }
}
/*
How It Stores the Value:
sb keeps collecting words like this:

First: "i"

Then: "i" + "love" = "ilove"

Then: "ilove" + "leetcode" = "iloveleetcode"

We stop as soon as we find a match with s.
*/