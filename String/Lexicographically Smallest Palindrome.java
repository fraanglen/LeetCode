class Solution {
    public String makeSmallestPalindrome(String s) {
        int n=s.length();
        StringBuilder reverse=new StringBuilder();
        for(int i=0;i<n;i++)
            reverse.append(Character.toString(Math.min(s.charAt(i),s.charAt(n-i-1))));
            return reverse.toString();
    
    }
}

/*why s.charAt(n-1-1);
n → Total length of the string.
i → Current index from the left.
n - i - 1 → Corresponding mirrored index from the right.
s.charAt(i) e 1)5-0-1=4--->e
            g  2)5-1-1=3--->f
            c 3)5-2-1=2--->c
            f  4)5 - 3 - 1 = 1--->g
            e  5)5 - 4 - 1 = 0--->e

            e---e same
            g---f f is smaller
            c---c same 
            f---g
            e---e  same 
            f is smaller according to ASCII value (Math.min(a,b)) so replacing g into f 
            */