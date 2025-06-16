class Solution {
    void pushZerosToEnd(int[] arr) {
        int i = 0; // Position to place next non-zero

        // First pass: move non-zero elements forward
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }

        // Second pass: fill remaining positions with zeros
        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }
    }
}
