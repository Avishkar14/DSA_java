import java.util.Arrays;

public class Q_238_ProdOfArrExecptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
        public static int[] productExceptSelf(int[] nums) {
//            int skip = 0;
//            int index = 0;
//            int[] ans = new int[nums.length];
//            for( int i = 0; i < nums.length ; i++){
//                int prod = 1;
//                if( index == i){
//                    skip++;
//                    // continue;
//                }
//                else{
//
//                    prod *= nums[i];
//                }
//
//                ans[index] = prod;
//            }
//            return ans;
            int[] ans = new int[nums.length ];
            int skip = 0;
            int index = 0;
            int prod = 1 ;
            int count = 0;
            for( int i = 0 ; i < nums.length; i++){

                if( count < 1){

                    if( skip == i){
                        skip++;
                        count++;
                        if( skip == nums.length ){
                            ans[ index ] = prod;
                            return ans;
                        }
                    }
                    else{
                        //skip != i
                        prod *= nums[i];
                    }
                }
                else{
                    //skip != i
                    prod *= nums[i];

                    if( i == nums.length - 1){
                        // reset all
                        ans[ index ] = prod;
                        index++;
                        count = 0;
                        i = -1;
                        prod = 1;
//                        if( index == nums.length ){
//
//                            break;
//                        }
                    }
                }
            }
            return ans;
        }
}
