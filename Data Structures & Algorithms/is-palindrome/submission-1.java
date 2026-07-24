class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.append(s.charAt(i));
            }
        }
        String str = sb.toString().toLowerCase();
        String isPalin = new StringBuilder(str).reverse().toString();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=isPalin.charAt(i)) return false;
        }
        return true;
    }
}
