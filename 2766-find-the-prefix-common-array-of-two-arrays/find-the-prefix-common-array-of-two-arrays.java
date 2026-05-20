class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int common = 0;
        int[] freq = new int[A.length+1];
        int[] ans = new int[A.length];
        freq[0] = 0;
        ans[0] = 0;
        for(int i = 0;i<A.length;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                common++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                common++;
            }
            ans[i] = common;
        }
    ans[n-1] = n;
    return ans;
    }
}