//1920. Build Array from Permutation:
import java.util.Arrays;
public class Q_1920 {
    public static void main(String[] args) {
        int[] nums={ 3, 4, 1, 0, 2};
        System.out.println(Arrays.toString( buildArray(nums)));

    }
        public static int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            for ( int i=0 ; i < nums.length  ; i++){
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
}
