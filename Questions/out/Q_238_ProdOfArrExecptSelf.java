public class Q_238_ProdOfArrExecptSelf {
    public static void main(String[] args) {

    }
        public static int[] productExceptSelf(int[] nums) {
            int skip = 0;
            int index = 0;
            int[] ans = new int[nums.length];
            for( int i = 0; i < nums.length ; i++){
                int prod = 1;
                if( index == i){
                    skip++;
                    // continue;
                }
                else{

                    prod *= nums[i];
                }

                ans[index] = prod;
            }
            return ans;
        }
}
