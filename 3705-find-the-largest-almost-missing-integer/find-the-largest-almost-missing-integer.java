import java.util.*;
class Solution {
    public int largestInteger(int[] nums, int k) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        for(int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for(int num : set) {
                hash.put(num, hash.getOrDefault(num, 0) + 1);
            }
        }
        int max = -1;
        for(int key : hash.keySet()) {
            if(hash.get(key) == 1) {
                max = Math.max(max, key);
            }
        }
        return max;
    }
}