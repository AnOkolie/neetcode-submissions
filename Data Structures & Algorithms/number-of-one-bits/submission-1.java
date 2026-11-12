class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        str = str.replaceAll("0","");
        return str.length();
    }
}
