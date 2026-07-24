class Solution {
    public int[] singleNumber(int[] nums) {
        long xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }
        long rightmostBit = xorSum & (-xorSum);
        
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & rightmostBit) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        
        return new int[]{a, b};
    }
}