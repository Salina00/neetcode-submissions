class Solution {
    public void combination2(int idx, int target, int[]arr, List<Integer>ds, List<List<Integer>>ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i] == arr[i-1])continue;
            if(arr[i] > target){
                break;
            }
            ds.add(arr[i]);
            combination2(i+1, target-arr[i],arr, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(candidates);
        combination2(0, target, candidates, new ArrayList<>(), ans);
        return ans;
    }
}
