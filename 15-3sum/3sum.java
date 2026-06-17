class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rutu = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right --;
                }else{
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[left]);
                    l1.add(nums[right]);
                    rutu.add(l1);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                   
                    
                }
            }
        }
    return rutu;
    }
}