class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        long count =0;
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            int last=intervals[i][1];
            int low=i+1;
            int high=n-1;
            int rightmost=i;
            while(low<=high){
                int mid=(low+high)/2;
                int first=intervals[mid][0];
                if(first<=last){
                    rightmost=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            count = count+(rightmost-i);
        }
        return count;
    }
}