import java.util.Arrays;

public class Q_34_FindFirstAndLastposn {
    public static void main(String[] args) {
        int[] nums = { 1,2,2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
        public static int[] searchRange(int[] nums, int target) {
            int start=0, end = nums.length -1 ;
            int[] out = new int[2];
            while(start<=end){
                int mid = start + ( end - start )/2;

                if ( nums[mid] > target ) {
                    end = mid -1;
                }
                else if ( nums[mid] < target) {
                    start = mid+1;
                }
                else {
                    if(  mid>0){
                        if( nums[mid] == nums[mid-1]){
                            out = new int[]{mid - 1, mid};
                        }
                    }
                    if(mid<(nums.length-1)){
                        if( nums[mid] == nums[mid+1] ){
                            out = new int[] {mid,mid+1};
                        }
//                        else if( (mid > 0) && nums[mid] != nums[mid-1] && target == nums[mid]){
//                            out = new int[]{mid , mid};
//                        }
                    }
                    if( (mid > 0) && nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1] && target == nums[mid]){
                        out = new int[]{mid , mid};
                    }
                    return out;

                }
            }
            out = new int[]{-1,-1};
            return out;
        }

}
