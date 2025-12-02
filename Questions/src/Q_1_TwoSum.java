//<<<<<<< Updated upstream
import java.util.Arrays;
//Q.1.; Two Sum
// NEEDS IMPROVEMENT
public class Q_1_TwoSum {
        public static void main(String[] args) {
            int[] nums = {3, 2, 3};
            int target = 5;
            System.out.println(Arrays.toString(twoSum_2( nums , target)));
        }
        public  static int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            int sum = 0;
            for ( int i = 0; i < nums.length ; i++ ){
                if ( sum == target ){
                    ans[1] = i;
                    ans[0] = i - 1;
                    break;
                }
                else{
                    if( i < nums.length -1 ){
                    sum = nums[i+1] + nums[i];
                    }
                }
            }
            return ans;
        }
    public  static int[] twoSum_2(int[] nums, int target){
        int[] ans = new int[2];
        int sum = 0;
        int flag = 0;
        int k = 0;
        for( int i = 0; i < nums.length ; i++){

            for( int j = i; j < nums.length ; j++){
                if( i != j){
                    sum = nums[i] + nums[j];
                    if( sum == target ){
                        ans[0] = i;
                        ans[1] = j;
                        return ans;
                    }
                }
            }

        }
        return ans;
    }
}
//=======
//import java.util.Arrays;
////Q.1.; Two Sum
//// NEEDS IMPROVEMENT
//public class Q_1_TwoSum {
//        public static void main(String[] args) {
//            int[] nums = {3, 2, 3};
//            int target = 5;
//            System.out.println(Arrays.toString(twoSum_2( nums , target)));
//        }
//        public  static int[] twoSum(int[] nums, int target) {
//            int[] ans = new int[2];
//            int sum = 0;
//            for ( int i = 0; i < nums.length ; i++ ){
//                if ( sum == target ){
//                    ans[1] = i;
//                    ans[0] = i - 1;
//                    break;
//                }
//                else{
//                    if( i < nums.length -1 ){
//                    sum = nums[i+1] + nums[i];
//                    }
//                }
//            }
//            return ans;
//        }
//    public  static int[] twoSum_2(int[] nums, int target){
//        int[] ans = new int[2];
//        int sum = 0;
//        int flag = 0;
//        int k = 0;
//        for( int i = 0; i < nums.length ; i++){
//
//            for( int j = i; j < nums.length ; j++){
//                if( i != j){
//                    sum = nums[i] + nums[j];
//                    if( sum == target ){
//                        ans[0] = i;
//                        ans[1] = j;
//                        return ans;
//                    }
//                }
//            }
//
//        }
//        return ans;
//    }
//}
//>>>>>>> Stashed changes
