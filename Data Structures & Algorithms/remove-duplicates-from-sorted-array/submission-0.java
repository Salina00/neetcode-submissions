class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>st = new LinkedHashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int k = 0;
        for(int num : st){
            nums[k] = num;
            k++;
        }
        return k;
    }
}