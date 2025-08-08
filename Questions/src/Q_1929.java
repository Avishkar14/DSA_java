import java.util.Arrays;

//1929. Concatenation of Array
public class Q_1929 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*(nums.length)];
        for( int i=0; i < 2*(nums.length); i++ ){
            if( i <= nums.length-1){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i - nums.length  ];
            }
        }
        return ans;
    }
}
