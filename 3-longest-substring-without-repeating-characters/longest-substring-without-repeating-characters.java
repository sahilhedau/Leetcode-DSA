class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        int left = 0;
        while(left < s.length()){
            int l1 = left;
            int count = 0;
            HashSet<Character> hash =new HashSet<>();
            while(l1 < s.length()){
                if(hash.contains(s.charAt(l1))){
                    break;
                }
                hash.add(s.charAt(l1));
                count++;
                l1++;
            }
            maxCount = Math.max(count,maxCount);
            left++;
        }
    return maxCount;
    }
}