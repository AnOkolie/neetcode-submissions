class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int l = 0;
        int r = 0;
        int missing = t.length();
        int min = Integer.MAX_VALUE;
        int start = 0;
        while(r<m){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c) >= 0){
                missing--;
            }
            while(missing == 0 && l<=r){
                char oldChar = s.charAt(l);
                map.put(oldChar,map.getOrDefault(oldChar,0)+1);
                if(map.get(oldChar) > 0){
                    missing++;
                    // int currMin = min-start+1;
                    if(min > r-l){
                        start = l;
                    }
                    min = Math.min(min, r-l+1);
                }
                l++;
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start,start+min);
    }
}
