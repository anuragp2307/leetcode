class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void findCombinations(int[] arr, int target, int index, List<Integer> temp, List<List<Integer>> result) {
       
        if (target == 0) {
            result.add(new ArrayList<>(temp)); 
            return;
        }
        if (target < 0 || index == arr.length) return;  
        temp.add(arr[index]);
        findCombinations(arr, target - arr[index], index, temp, result);
        
        
        temp.remove(temp.size() - 1);
        findCombinations(arr, target, index + 1, temp, result);
    }
}
