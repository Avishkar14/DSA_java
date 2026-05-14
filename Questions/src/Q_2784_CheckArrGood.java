import java.util.Arrays;
class Q_2784_CheckArrGood {
    public static boolean isGood(int[] nums) {
        int n = nums.length;
        if( n < 2){
            return false;
        }
        Arrays.sort(nums);
        for( int i = 0; i < n - 1; i++){
            if( nums[i] != i+1 ){
                return false;
            }
        }
        if( nums[n - 1] != nums[n - 2] ){
            return false;
        }

        return true;
    }
}
