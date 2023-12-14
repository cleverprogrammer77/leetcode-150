class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLen = 1;
        for(int i = 1; i < s.length(); i++){
            int l = i - 1;
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > maxLen){
                    maxLen = r - l + 1;
                    start = l;
                }
                l -= 1;
                r += 1;
            }
            l = i - 1;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > maxLen){
                    maxLen = r - l + 1;
                    start = l;
                }
                l -= 1;
                r += 1;
            }
        }
    return s.substring(start, start + maxLen);
    }
}