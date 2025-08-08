//1480. Running Sum of 1d Array
import java.util.Arrays;

public class Q_1480 {
    public static void main(String[] args) {
        int[] nums={ 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        // int  sum=0;
        for(int i=0; i< nums.length ; i++){
            if(i==0){
                nums[i]=nums[i] ;
                //i++;
            }
            else{
                nums[i]=nums[i]+nums[i-1];
            }

        }
        return nums;
    }
}
