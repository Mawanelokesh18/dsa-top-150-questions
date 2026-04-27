class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int start = 0;
        int maxLen = 1;
        int len = 1;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for(int end=1;end<s.length();){
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
                len--;
            }
            else {
                len++;
                set.add(s.charAt(end));
                end++;
                if(len > maxLen) maxLen = len;
            }
        }
        return maxLen;
    }
}
