class Solution {
    public boolean canTransform(int[] source, int[] target) {
        if(source.length!=target.length){
            return false;
        }
        long sourceSum=0;
        long targetSum=0;
        for(int num:source){
            sourceSum+=num;
        }
        for(int num:target){
            targetSum+=num;
        }
        return sourceSum==targetSum;
    }
}