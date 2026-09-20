class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count =0;
        int n= intervals.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int first1=intervals[i][0];
                int last1=intervals[i][1];
                int first2=intervals[j][0];
                int last2=intervals[j][1];
                int max=Math.max(first1,first2);
                int min=Math.min(last1,last2);
                if(max<=min){
                    count++;
                }
            }
        }
        return count;
    }
}