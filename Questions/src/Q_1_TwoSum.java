import java.util.Arrays;
//Q.1.; Two Sum
// NEEDS IMPROVEMENT
public class Q_1_TwoSum {
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;
            System.out.println(Arrays.toString(twoSum( nums , target)));
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
}
