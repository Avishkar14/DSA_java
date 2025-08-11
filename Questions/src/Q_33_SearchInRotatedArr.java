//Q 33. Search in Rotated Sorted Array
//needs to be remade as fails test case: [1,3] ,target = 3 and o/p = 1 but our ans is -1;
public class Q_33_SearchInRotatedArr  {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 0, 1, 2, 3, 4 };
        int target = 3;
        System.out.println(search(nums , target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int max = max(nums);
        int ans = 0;
        while ( ans == 0 ){
        if( target <  nums[end] ){
            //search on right
            ans = binarysearch( nums , target , (max+1) ,  end );
            // start = max + 1;
        }
        else if( target > nums[end]){
            //search of left
           ans =  binarysearch( nums , target , start ,  (max - 1) );
            // end = max - 1;
        }
        else {
            //target = max
            return max;
        }
        return ans;
        }
//        System.out.println(ans);
        return -1;
    }

    public static int max( int[] nums ){

        int start = 0;
        int end = nums.length - 1;
        // int max = 0;

        while( start<=end ){

            int mid = start + (end - start)/2;
            if( nums[start] > nums[end] && nums[start] > nums[mid]){
                //search for max on left
                end = mid ;

            }
            else if( nums[start] > nums[end] && nums[start] < nums[mid] ){
                if( nums[mid+1] > nums[mid]) {
                    //search for mid on right
                    start = mid;
                }
                else{
                    return mid;
                }
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    public static int binarysearch( int[] nums , int target , int start , int end){


        while( start <= end){
            int mid = start + ( end - start)/2 ;
            if( nums[mid] > target){
                //left search
                end = mid - 1;
            }
            else if( nums[mid] < target ){
                //right search
                start = mid + 1;
            }
            else{
                return mid;
            }

        } return -1;
    }
}