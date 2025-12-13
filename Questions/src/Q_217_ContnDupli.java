import java.util.Arrays;

class Q_217_ContnDupli {
    //psvm
    public static boolean containsDuplicate(int[] nums) {
        // if(nums.length > 10000){
        //     return false;
        // }
        Arrays.sort(nums);
        // for( int i = 0; i < nums.length - 1; i++){
        //     // if( i < nums.length - 1)
        //     for( int j = i + 1; j < nums.length; j++){
        //         if( nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        int i = 0;
        while( i < nums.length - 1){
            if( nums[i] == nums[i + 1]){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
