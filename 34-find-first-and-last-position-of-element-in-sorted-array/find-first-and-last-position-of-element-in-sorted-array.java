class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        if(nums.length == 0){
            return arr;
        }
        if(nums.length == 1){
            if(nums[0] == target){
                arr[0] = 0;
                arr[1] = 0;
                return arr;
            }else{
                return arr;
            }
        }
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target && count ==0){
                count++;
                arr[0] = i;
            }else if(nums[i] == target && count > 0){
                arr[1] = i;
                count++;
                //break;
            }
        }
        if(count == 1){
            arr[1] = arr[0];
        }
    return arr;
    }
}