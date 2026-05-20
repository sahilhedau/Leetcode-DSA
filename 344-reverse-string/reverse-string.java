class Solution {
    public void reverseString(char[] s) {
        char[] ans = new char[s.length];
        int right = s.length - 1;
        for(int i = s.length-1, j=0;i>=0;i--){
            ans[j] = s[i];
            j++; 
        }
        for(int i = 0;i<s.length;i++){
            s[i] = ans[i];
        }
    }
}