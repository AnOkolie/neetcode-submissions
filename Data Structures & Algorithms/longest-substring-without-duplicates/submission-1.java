class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        Map<Character,Integer> map= new HashMap<>();
        int n = s.length();
        int l = 0;
        int r = 0;
        while(r < n){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c) >= 2 && l<r){
                char alt = s.charAt(l);
                map.put(alt,map.get(alt)-1);
                l++;
            }
            len = Math.max(len,(r-l)+1);
            r++;
        }
        return len;
    }
}
