class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int [] res = new int[n];
        for(int i=0; i<n; i++){
            int prod = 1;
            int currEle = i;
            for(int j=0; j<i; j++){
                prod *= nums[j];
            }
            for(int k=i+1; k<n; k++){
                prod *= nums[k];
            }
            res[i] = prod;
        }
        return res;
}
}