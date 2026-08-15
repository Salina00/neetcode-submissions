class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.empty())return false;
                char c = st.peek();
                if(c == '{' && ch == '}' || c == '[' && ch == ']' || c == '(' && 
                    ch == ')'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
