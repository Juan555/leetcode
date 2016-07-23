/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new List<Interval> ();
        if ( intervals.size() == 0 ) return result;
        //sort
        Collections.sort ( intervals, new Comparator<Interval>{
            public int compare( Interval a, Interval b ) {
                return a.start - b.start;
            }
            });
       
        //add elements into result
        result.add ( intervals[0] );
        for ( int i = 1; i < intervals.size(); ++i ) {
            int length = intervals.size();
            if ( intervals[i].start > result[length - 1].end ) {result.add(intervals[i]);}
            else if ( intervals[i].end < result[length - 1].start ) {result.add(0, intervals[i]);}
            else {
                int min = Math.min(intervals[i].start, result[length - 1].start);
                int max = Math.max(intervals[i].end, result[length - 1].end);
                result.set( length - 1, new Interval(min, max) );
            }
        }
        return result;
    }
}