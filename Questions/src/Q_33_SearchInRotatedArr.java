//Q 33. Search in Rotated Sorted Array
//needs to be remade as fails test case: [1,3] ,target = 3 and o/p = 1 but our ans is -1;
public class Q_33_SearchInRotatedArr  {
    public static void main(String[] args) {
        int[] nums = { 1 , 3 };
        int target = 1;
        System.out.println(search(nums , target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int max = max(nums);
            if( max == -1) {
                //means array is normal sorted array
               return  binarysearch( nums , target , start,  end );
            }

            if( target == nums[max]){
                return max;
            }

        if( target <=  nums[end] ){
            //search on right
            return binarysearch( nums , target , (max+1) ,  end );
            // start = max + 1;
        }
        else {
            //search of left
           return binarysearch( nums , target , start ,  (max - 1) );
            // end = max - 1;
        }
    }

    public static int max( int[] nums ){

        int start = 0;
        int end = nums.length - 1;
        // int max = 0; max is our pivot

        while( start <= end ){

            int mid = start + (end - start)/2;

            if( mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if ( start < mid && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            if(  nums[start] >= nums[mid]){
                //search for max on left
                end = mid - 1;

            }
            else {
                    //search for mid on right
                    start = mid + 1;
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