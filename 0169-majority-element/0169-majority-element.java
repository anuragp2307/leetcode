class Solution {
    public int majorityElement(int[] nums) {
        int temp=0;
        int count =0;
        for(int num:nums){
            if(count==0){
                temp=num;
            }
            count+=(num==temp)?1:-1;
        }
        return temp;

        
    }
}