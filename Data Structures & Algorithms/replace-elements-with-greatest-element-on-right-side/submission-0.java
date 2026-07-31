class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int rmax = -1;
            for(int j = i+1; j<n; j++){
                rmax = Math.max(rmax, arr[j]);
            }
            ans[i] = rmax;
        }
        return ans;
    }
}