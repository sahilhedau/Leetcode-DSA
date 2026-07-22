class Solution {
    public int findPeakElement(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int key = arr[arr.length-1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
    return -1;
    }
}