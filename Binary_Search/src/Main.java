
public class Main {
    public static void main(String[] args) {
        int[] arr= { 1,23 ,34 ,45 , 56, 435 , 890 };
        int target = 56;
        int ans = BinarySearch( arr , target);
        System.out.println(ans);
    }
    static int BinarySearch( int[] arr , int target){
        int start = 0;
        int end = arr.length - 1 ;

        while( start <= end ){
            //int mid = ( start + end) / 2; not best way as possible that value of end exceed int max limit on large array

            int mid = start + (end - start) / 2;

            //left side
            if ( arr[mid] > target ){
                end = mid - 1 ;

            }
            // right side
            else if ( arr[mid] < target ){
                start = mid + 1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}