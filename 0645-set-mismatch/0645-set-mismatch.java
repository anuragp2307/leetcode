class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
       
        int[] count = new int[n + 1]; 
        
        int duplicate = -1, missing = -1;
        
        
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        
        
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}
