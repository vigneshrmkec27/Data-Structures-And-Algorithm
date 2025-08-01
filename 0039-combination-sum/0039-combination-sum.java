class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
         List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // Include the current element
        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);

        // Backtrack and remove the last added number
        current.remove(current.size() - 1);

        // Skip to the next element (exclude current)
        backtrack(candidates, target, index + 1, current, result);
    }

}