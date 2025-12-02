// Updated upstream
public class Q_367_ValidPerfSq {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(isPerfectSquare(num));
    }
        public static boolean isPerfectSquare(int num) {
            long start = 0;
            long end = num;

            while( start <= end){
                long mid = start + (end/2 - start/2 );
                if( mid*mid == num){
                    return true;
                }
                else if( mid*mid > num){
                    end = mid - 1;
                }
                else{
                    // mid*mid < num
                    start = mid + 1;
                }

            }
            return false;
        }

}
//=======
//public class Q_367_ValidPerfSq {
//    public static void main(String[] args) {
//        int num = 10;
//        System.out.println(isPerfectSquare(num));
//    }
//        public static boolean isPerfectSquare(int num) {
//            long start = 0;
//            long end = num;
//
//            while( start <= end){
//                long mid = start + (end/2 - start/2 );
//                if( mid*mid == num){
//                    return true;
//                }
//                else if( mid*mid > num){
//                    end = mid - 1;
//                }
//                else{
//                    // mid*mid < num
//                    start = mid + 1;
//                }
//
//            }
//            return false;
//        }
//
//}
////>>>>>>> Stashed changes
