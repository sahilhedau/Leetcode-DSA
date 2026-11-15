class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n==1){
            return true;
        }
        int g = n-1;
        int i = n-2;
        while(i>=0){
            if(i+nums[i]>=g){
                g=i;
            }
            i--;
            if(g==0){
                return true;
            }
        }
    return false;
    }
}