class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        sort(strs.begin(), strs.end());
        string ans = "";
        string s1 = strs[0];
        string s2 = strs[strs.size()-1];
        int n = min(s1.size(), s2.size());
        for(int i=0; i<n; i++){
            if(s1[i] != s2[i])break;
            ans += s1[i];
        }
        
        return ans;
    }
};