/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {//bug: when end and start overlap, combine them
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        //create result list
        List<Interval> result = new ArrayList<Interval>();
        result.add ( newInterval );
        //check null???
        if (intervals == null || intervals.size() == 0 ) return result;
        //traverse intervals
        //1.intervals[i] < newInterval-->add intervals[i] to the position before newInterval
        //2.intervals[i] > newInterval-->add intervals[i] after newInterval
        //3.overlap-->return min(start) and max(end)
        for ( Interval i: intervals ) {
            int a = result.get(result.size() - 1).start;
            int b = result.get(result.size() - 1).end;
            if ( i.end < a ) { result.add ( result.size() - 1, i);}
            else if ( i.start > b ) { result.add ( i );}
            else {
                int begin = Math.min ( i.start, a );
                int last = Math.max ( i.end, b );
                result.set ( result.size() - 1, new Interval ( begin, last ) );
            }
        }
        return result;
        //return result
    }
}