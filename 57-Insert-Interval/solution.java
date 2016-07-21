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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        //create result list
        List<Interval> result = new ArrayList<Interval>();
        result.add ( newInterval );
        //traverse intervals
        //1.intervals[i] < newInterval-->add intervals[i] to the position before newInterval
        //2.intervals[i] > newInterval-->add intervals[i] after newInterval
        //3.overlap-->return min(start) and max(end)
        for ( Interval i: intervals ) {
            if ( i.end <= newInterval.start ) { result.add ( result.size() - 1, i);}
            else if ( i.start >= newInterval.end ) { result.add ( i );}
            else {
                int begin = Math.min ( i.start, newInterval.start );
                int last = Math.max ( i.end, newInterval.end );
                result.set ( result.size() - 1, new Interval ( begin, end ) );
            }
        }
        return result;
        //return result
    }
}