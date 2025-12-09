class Q_35_SearchInsertPosn {
    public static void main(String[] args) {
        int[] nums = { 1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while( start <= end){
            mid = (start/2 - end/2 ) + end;
            if( nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target ){
                //rhs
                start = mid+1;

            }
            else{
                //lhs
                end = mid - 1;
            }
        }
        // if not found element
        if( mid > 0){
            if( nums[mid] > target && nums[mid-1] < target){
                return mid;
            }
        }
        //max
        if( target > nums[nums.length -1 ]){
            return nums.length ;
        }
        //min
        else if( target < nums[0]){
            return 0;
        }
//        mid--;
        // else{
        //     return mid+1;
        // }
        return mid+1;
    }
}