class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n;
        int check = x;
        while(x > 0){
            n = x % 10;
            x = x/10;
            rev = rev*10 + n;
        }
        if(rev == check){
            return true;
        }
    return false;
    }
}