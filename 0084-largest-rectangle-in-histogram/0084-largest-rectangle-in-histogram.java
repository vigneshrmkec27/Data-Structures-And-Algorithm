class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && heights[st.peek()] > currHeight) {
                int ele = st.pop();  // index of height to be calculated
                int height = heights[ele];
                int nse = i;  // next smaller element index is current i
                int pse = st.isEmpty() ? -1 : st.peek();  // previous smaller element index
                int width = nse - pse - 1;
                max = Math.max(max, height * width);
            }

            st.push(i);
        }

        return max;
    }
}
