class Solution {
    // Function to find the repeating and missing number
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        // Expected sums
        long sn = (long) n * (n + 1) / 2;
        long sn2 = (long) n * (n + 1) * (2 * n + 1) / 6;

        long s = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * arr[i];
        }

        long val1 = s - sn;       // x - y
        long val2 = s2 - sn2;     // x^2 - y^2

        long sum = val2 / val1;   // x + y

        long x = (val1 + sum) / 2;  // Repeating number
        long y = x - val1;          // Missing number

        res.add((int) x);
        res.add((int) y);
        return res;
    }
}
