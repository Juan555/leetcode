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
        if ( points.length < 3 ){
            return points.length;
        }
        int result = 2; //at least two points in a line
        int max = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for ( int i = 0; i < points.length; ++i ){
            int same_num = 0;
            for ( int j = i + 1; j <points.length; ++j ){
                if ( points[i].x == points[j].x && points[j].y == points[i].y ){
                    same_num++;
                }
                else{
                String key = get_key( points[i], points[j] );
                if ( map.containsKey(key) ) {
                    int count = map.getKey(key);
                    count++;
                    map.put(key, count);
                    if (count > max){
                        max = count;
                    }
                }
                else{
                    map.put(key, 1);
                    if ( max == 0 ){
                        max = 1;
                    }
                }
                }
            }
            result = Math.max (result, max + same_num + 1);
            map.clear();
        }
        return result;
    }
    
    public String get_key(Point first, Point second) { //ax + by = c
        int a;
        int b;
        float c; //pay attention it's float
        if ( first.x == second.x ){ // vertical
            a = 1;
            b = 0;
            c = first.x;
        }
        if ( first.y == second.y ) { // horizontal
            a = 0;
            b = 1;
            c = first.y;
        }
        int dx = first.x - second.x;
        int dy = first.y - second.y;
        int gcd = find_gcd( Math.abs(dx), Math.abs(dy) );
        a = dy / gcd;
        b = dx / gcd;
        if ( a * b < 0 ){
            a = -Math.abs(a);
        }
        if ( a * b > 0 ){
            a = Math.abs(a);
        }
        b = Math.abs(b);
        c = a * first.x + b * first.y;
        return "a" + "b" + "c";
    }
    
    public int find_gcd( int a, int b ) {
        if ( b == 0 ){
            return a;
        }
        return find_gcd ( b, b % a );
    }
}