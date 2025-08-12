//1365. How Many Numbers Are Smaller Than the Current Number
//1st brute force solution
import java.util.Arrays;
public class Q_1365_totalSmallerNo {
    public static void main(String[] args) {
        int[] nums = { 1 , 2 , 4 ,5 , 6, 9};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
        public static int[] smallerNumbersThanCurrent(int[] nums) {
//            int[] arr = new int[nums.length ];
            for(  int i=0; i < nums.length; i++ ){
                int count=0;
                for( int j=0; j < nums.length  ; j++){
                    if( nums[j] != nums[i] && nums[j] < nums[i] ){
                        count++;
                    }
                }
                nums[i] = count;
            }
            return nums;
        }

}
