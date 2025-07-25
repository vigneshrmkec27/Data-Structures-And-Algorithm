class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        int n = nums.length;
        int total = 1 << n;
        List<List<Integer>> allsubsets = new ArrayList<>();
        
        for (int mask = 0; mask < total; mask++) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    ans.add(nums[i]);
                }
            }
            allsubsets.add(ans);
    }
    return allsubsets;
}
}