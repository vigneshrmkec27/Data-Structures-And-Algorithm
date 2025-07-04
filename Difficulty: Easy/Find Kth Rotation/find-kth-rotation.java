// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
     int low = 0, high = arr.size() - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // Search space is already sorted
            if (arr.get(low) <= arr.get(high)) {
                if (arr.get(low) < ans) {
                    index = low;
                    ans = arr.get(low);
                }
                break;
            }

            // Left part is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) < ans) {
                    index = low;
                    ans = arr.get(low);
                }
                low = mid + 1;
            } else {
                // Right part is sorted
                if (arr.get(mid) < ans) {
                    index = mid;
                    ans = arr.get(mid);
                }
                high = mid - 1;
            }
        }
        return index;
    }
}