class Solution {
    public int majorityElement(int[] nums) {
        int cc = 0, res = 0;
        for(int num : nums){
            if(cc == 0){ res = num;}
            if(num == res){cc+=1;}
            else {cc-=1;}
        }
        return res;
    }

}