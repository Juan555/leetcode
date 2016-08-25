/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {//I cannot believe I solved a hard problem without any help..............................
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval> ();
        if ( intervals.size() == 0 ) return result;
        //sort
        Collections.sort ( intervals, new Comparator<Interval>(){
            public int compare( Interval a, Interval b ) {
                return a.start - b.start;
            }
        });
       
        //add elements into result
        result.add ( intervals.get(0) );
        for ( int i = 1; i < intervals.size(); ++i ) {
            int length = result.size();
            if ( intervals.get(i).start > result.get(length - 1).end ) {result.add(intervals.get(i));}
            else if ( intervals.get(i).end < result.get(length - 1).start ) {result.add(0, intervals.get(i));}
            else {
                int min = Math.min(intervals.get(i).start, result.get(length - 1).start);
                int max = Math.max(intervals.get(i).end, result.get(length - 1).end);
                result.set( length - 1, new Interval(min, max) );
            }
        }
        return result;
    }
}