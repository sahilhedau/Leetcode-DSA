class Solution {
    public int GCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n * (n-1);
        int oddSum = n*n;
        
        int hg = GCD(evenSum, oddSum);
        return hg;
    }
    
}