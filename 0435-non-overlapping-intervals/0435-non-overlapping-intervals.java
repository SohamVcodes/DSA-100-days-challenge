class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int no = 0 ; 
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int lastEnd = intervals[0][1] ; 
        for(int i = 1; i< intervals.length ; i++ )
        { if(intervals[i][0] >= lastEnd) { lastEnd = intervals[i][1] ;}
        else { no++ ;} } return no ;
    }
}