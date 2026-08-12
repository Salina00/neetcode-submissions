class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        set<int>st;
        for(int num : nums){
            st.insert(num);
        }
        int k = 0;
        for(int num : st){
            nums[k++] = num; 
        }
        return k;
    }
};