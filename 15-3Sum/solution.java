public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Arrays.sort(nums);
        // int length = nums.length;
        // List<List<Integer>> result = new LinkedList<>();
        // for ( int i = 0; i < length - 2; ++i ) {
        //     if ( i > 0 && nums[i] == nums[i - 1]){continue;}
        //     for ( int j = i + 1; j < length - 1; ++j ) {
        //         for ( int k =  j + 1; k < length; ++k ) {
        //             if ( nums[k] == -( nums[i] + nums[j] ) ) {
        //                 List element = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 if ( result.size() != 0 && result.get(result.size() - 1) == element ) {
        //                     continue;
        //                 }
        //                 else {
        //                     result.add( element);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return result;
        
        //sort the array
        //make the first element fixed, and traverse for second and third
        //skip the duplicate first element
        //skip duplicate second and third element
        Arrays.sort(nums);
        List<List<Integer>> result = ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; ++i ) {
            if ( i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int low = i + 1;
                int high = nums.length - 1;
                while ( low < high ) {
                    if ( nums[low] + nums[high] + nums[i] == 0 ) {
                        result.add(Arrays.asList(nums[i],nums[low], nums[high]);
                        while ( low < high && nums[low] == nums[low + 1]) {low ++;}
                        while ( low < high && nums[high] == nums[high - 1]) { high --;}
                        low++;
                        high--;
                    }
                    else if ( nums[high] + nums[low] + nums[i] > 0 ) {
                        high--;
                    }
                    else { low++;}
                }
            }
            else{continue;}
        }
    }
}