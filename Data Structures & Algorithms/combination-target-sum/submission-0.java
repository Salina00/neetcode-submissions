class Solution {
    public void combination(int[] nums, int target, List<Integer>ds,      List<List<Integer>>ans, int idx){
        int n = nums.length;
        if(idx == n){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(nums[idx] <= target){
            ds.add(nums[idx]);
            combination(nums, target-nums[idx], ds, ans, idx);
            ds.remove(ds.size() - 1);
        }
        combination(nums, target, ds, ans, idx+1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        combination(nums, target, new ArrayList<>(), ans, 0);
        return ans;
    }
}
