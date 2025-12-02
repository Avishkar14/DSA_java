//<<<<<<< Updated upstream
//public class Q_1295_FindNumwithEven {
//    public static void main(String[] args) {
//        int[] nums = { 555,901,482,1771 };
//        System.out.println(findNumbers(nums));
//    }
//
//        public static int findNumbers(int[] nums) {
//
//            int even=0;
//            for(int i=0; i < nums.length ; i++){
//                int count = 0;
//                while( nums[i] > 9){
//                    nums[i] = nums[i]/10;
//                    count++;
//                }
//                if ( nums[i] < 10 && nums[i] > 0 ){
//                    count++;
//                }
//                if( count%2 == 0){
//                    even++;
//                }
//            }
//            return even;
//        }
//
//}
//=======
public class Q_1295_FindNumwithEven {
    public static void main(String[] args) {
        int[] nums = { 555,901,482,1771 };
        System.out.println(findNumbers(nums));
    }

        public static int findNumbers(int[] nums) {

            int even=0;
            for(int i=0; i < nums.length ; i++){
                int count = 0;
                while( nums[i] > 9){
                    nums[i] = nums[i]/10;
                    count++;
                }
                if ( nums[i] < 10 && nums[i] > 0 ){
                    count++;
                }
                if( count%2 == 0){
                    even++;
                }
            }
            return even;
        }

}
//>>>>>>> Stashed changes
