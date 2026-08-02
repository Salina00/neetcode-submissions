class Solution {
    public int scoreOfString(String s) {
        int diff = 0;
        for(int i=1; i<s.length(); i++){
            diff += Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return diff;
    }
}