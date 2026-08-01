class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cc = 0, mc = 0;
        for(int num : nums){
            if(num == 1)cc++;
            mc = Math.max(cc, mc);
            if(num == 0)cc = 0;
        }
        return mc;
    }
}