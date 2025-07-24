class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        return (n & n-1)==0;
    }
}