class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        List<StringBuilder>[] lst= new ArrayList[26];
        for (int i=0;i<26;i++) lst[i] = new ArrayList<>();
        for (String w : words) {
            lst[w.charAt(0) - 'a'].add(new StringBuilder(w));
        }
        int count=0;
        for (char c:s.toCharArray()) {
            List<StringBuilder>waiting=lst[c - 'a'];
            lst[c - 'a']=new ArrayList<>();
            for (StringBuilder sb:waiting) {
                sb.deleteCharAt(0);
                if (sb.length()==0) {
                    count++;
                } else {
                    lst[sb.charAt(0) - 'a'].add(sb);
                }
            }
        }
        return count;
    }
}
