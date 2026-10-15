class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int cnt[] = new int[26];
        int len = 0;
        int maxFreq = 0;
        while(r<n){
            char c = s.charAt(r);
            cnt[c-'A']++;
            maxFreq = Math.max(cnt[c-'A'],maxFreq);
            int strLen = (r-l)+1;
            if(strLen - maxFreq > k){
                cnt[s.charAt(l)-'A']--;
                l++;
            }
            len = Math.max(len,strLen);
            r++;
        }
        return n-l;
    }
}
