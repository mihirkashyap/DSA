class Solution {
    public boolean canJump(int[] nums) {
        int Reach = 0;
        for(int i = 0; i < nums.length; i++){
            if(Reach < i)
                return false;
            Reach = Math.max(Reach, i+nums[i]);
        }
        return true;
    }
}
