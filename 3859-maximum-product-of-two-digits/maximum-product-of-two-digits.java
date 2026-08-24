class Solution {
    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        ArrayList<Integer> l1 = new ArrayList<>();
        while(n != 0){
            int temp = n % 10;
            l1.add(temp);
            n/=10;
        }
        Collections.sort(l1);

    return l1.get(l1.size()-1)*l1.get(l1.size()-2);
    }
}