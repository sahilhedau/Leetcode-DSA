class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
            
        }
        List<Integer> list = new ArrayList<>(hash);
        Collections.sort(list);
        int n = list.size();
        if (n < 3) {
            return list.get(n - 1);
        }
        return list.get(n-3);
    }
}