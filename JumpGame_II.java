class Solution {
    public int jump(int[] nums) {
        int Reach = 0, Max = 0, jumps = 0;
        for(int i=0; i<nums.length-1; i++){
            if(i+nums[i]>Max){
                Max=i+nums[i];
            }
            if(i==Reach){
                jumps++;
                Reach=Max;
            }
        }
        return jumps;
    }
}
