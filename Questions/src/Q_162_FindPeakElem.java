public class Q_162_FindPeakElem {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int flag = 0;
        int mid = start + (end - start)/2;
        while(flag == 0){

            if( mid < end && nums[mid] > nums[mid +1] ){

                if( mid > start && nums[mid] > nums[mid - 1] ){
                    flag = 1;
                }
                else{
                    mid = mid -1;
                }
            }
            else if( mid < end && nums[mid] < nums[mid +1]  ){
                mid = mid + 1;
                if( mid > start && nums[mid] > nums[mid - 1] ){
                    flag = 1;
                }
                else{
                    mid = mid -1;
                }
            }
        }
        return mid;

    }
}
