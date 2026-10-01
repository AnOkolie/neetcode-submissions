class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        s = sb.toString();
        if(s == "") return true;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char c_l = s.charAt(l);
            char c_r = s.charAt(r);
            if (c_l == c_r) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}
