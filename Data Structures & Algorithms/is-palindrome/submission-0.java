class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String t = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch) == true){
                t += ch;
            }
        }
        int i=0, j=t.length()-1;
        while(i<j){
            if(t.charAt(i) != t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
