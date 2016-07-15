/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length < 3) return points.length; // 0/1/2 points
        int res = 1; // at least 1 point
        Map<String, Integer> map = new HashMap<String, Integer>(); // line,count
        for (int i = 0; i < points.length; i++) {
            int max = 0;
            int countSame = 0; // # of same points
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y ) countSame++; // same point
                else {
                    String key = get_key(points[i], points[j]); // a|b|c
                    if (map.containsKey(key)) { // on the line
                        int count = map.get(key) + 1;
                        map.put(key, count); // update count
                        if (count > max) max = count; // update max
                    } else { // not on any line
                        map.put(key, 1);
                        if (max == 0) max++; // update max
                    }
                }
            }
            res = Math.max(res, max + countSame + 1); // +1 for the start point
            map.clear(); // clear map for next point
        }
        return res;
    }
    
    private static String get_key(Point p1, Point p2) { //ax + by = c
        int a, b;
        float c;
        if (p1.x == p2.x) { // vertical
            b = 0;
            a = 1;
            c = p1.x;
        } else if (p1.y == p2.y) { // horizontal
            a = 0;
            b = 1;
            c = p2.y;
        } else { // ax + by = c
            int dx = p1.x - p2.x;
            int dy = p1.y - p2.y;
            /*reduce to simplest*/
            int gcd = gcd(Math.abs(dx), Math.abs(dy));
            a = dy / gcd;
            b = dx / gcd;
            if (a * b < 0) { // force a to be negative
                a = -1 * Math.abs(a);
                b = Math.abs(b);
            } else { // force both positive
                a = Math.abs(a);
                b =  Math.abs(b);
            }
            c = a * p1.x + b * p1.y; // c = ax + by
        }
        return a + "|" + b + "|" + c; // key format
    }

    
    private static int find_gcd( int a, int b ) {
        if ( b == 0 ){
            return a;
        }
        return find_gcd ( b, a % b );
    }
}