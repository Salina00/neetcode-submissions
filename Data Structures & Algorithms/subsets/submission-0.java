class Solution {
    public void calcSubsets(int idx, List<Integer>ds, int[] nums, List<List<Integer>>res){
        int n = nums.length;
        if(idx >= n){
            res.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        calcSubsets(idx+1, ds, nums, res);
        ds.remove(ds.size()-1);
        calcSubsets(idx+1, ds, nums, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>ds = new ArrayList<>();
        List<List<Integer>>sub = new ArrayList<>();
        int idx = 0;
        calcSubsets(idx, ds, nums, sub);
        return sub;
    }
}
