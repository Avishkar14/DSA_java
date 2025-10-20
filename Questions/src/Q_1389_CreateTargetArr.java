<<<<<<< Updated upstream
import java.util.Arrays;
//1389. Create Target Array in the Given Order
public class Q_1389_CreateTargetArr {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        int[] index = {0,1,0};
        System.out.println(Arrays.toString(createTargetArray(nums, index))); //Output: [0,4,1,3,2]
    }
        public static int[] createTargetArray(int[] nums, int[] index) {
            int[] result=new int[nums.length];
            for( int i=0; i < nums.length ; i++ ){

                if( nums[i] == 0 && index[i] == 0){
                    for(int j = nums.length - 2 ; j >= index[i] ; j-- ){
                        result[j + 1] = result[j];
                    }
                    result[index[i]] = nums[i];
                }

                if( result[index[i]] == 0){
                    result[index[i]] = nums[i];
                }
                else if( result[index[i]] != 0){
                    //element already exists then:
                    for(int j = nums.length - 2 ; j >= index[i] ; j-- ){
                        result[j + 1] = result[j];
                    }
                    result[index[i]] = nums[i];
                }
            }
            return result;
        }
}
=======
import java.util.Arrays;
//1389. Create Target Array in the Given Order
public class Q_1389_CreateTargetArr {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        int[] index = {0,1,0};
        System.out.println(Arrays.toString(createTargetArray(nums, index))); //Output: [0,4,1,3,2]
    }
        public static int[] createTargetArray(int[] nums, int[] index) {
            int[] result=new int[nums.length];
            for( int i=0; i < nums.length ; i++ ){

                if( nums[i] == 0 && index[i] == 0){
                    for(int j = nums.length - 2 ; j >= index[i] ; j-- ){
                        result[j + 1] = result[j];
                    }
                    result[index[i]] = nums[i];
                }

                if( result[index[i]] == 0){
                    result[index[i]] = nums[i];
                }
                else if( result[index[i]] != 0){
                    //element already exists then:
                    for(int j = nums.length - 2 ; j >= index[i] ; j-- ){
                        result[j + 1] = result[j];
                    }
                    result[index[i]] = nums[i];
                }
            }
            return result;
        }
}
>>>>>>> Stashed changes
