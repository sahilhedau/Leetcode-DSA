class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(hash.keySet());
        Collections.sort(list, (a,b)->hash.get(b)-hash.get(a));// Descendingsort
        for(int i =0;i<k;i++){
            ans[i] = list.get(i);
        }
    return ans;
    }
}