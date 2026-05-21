class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int prevIndex = 0;
        for(int i = 0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                prevIndex = hash.get(nums[i]);
                if(i - prevIndex <= k){
                    return true;
                }
            }
            hash.put(nums[i],i);
        }
    return false;
    }
}