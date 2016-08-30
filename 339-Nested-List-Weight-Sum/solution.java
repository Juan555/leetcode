/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        int result = 0;
        return helper( nestedList, result );
    }
    public int helper(List<NestedInteger> nestedList, int result) {
        if (nestedList == null || nestedList.size() == 0 ){
            return 0;
        }
        for ( int i = 0; i < nestedList.size(); ++i ){
            NestedInteger element = nestedList.get(i);
            if ( element.isInteger() ){
                result += element.getInteger();
            }
            else {
                return helper( element, result );
            }
        }
        return result;
    }
}