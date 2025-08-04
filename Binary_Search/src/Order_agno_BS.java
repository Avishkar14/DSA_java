public class Order_agno_BS {
    public static void main(String[] args) {
        int[] arr= { 1,23 ,34 ,45 , 56, 435 , 890 };
        int target = 34 ;
        int ans = BinarySearch( arr , target);
        System.out.println(ans);
    }
    static int BinarySearch( int[] arr , int target){
        int start = 0;
        int end = arr.length - 1 ;

        boolean asc;
        if ( arr[start] < arr[end]){
            asc = true;
            System.out.println(" Ascending arr");
        }
        else {
            asc = false;
            System.out.println(" Descending arr");
        }
        // whole above asc can be written in shortcut as ==> boolean asc = arr[start] < arr[end];
        while( start <= end ){
            //int mid = ( start + end) / 2; not best way as possible that value of end exceed int max limit on large array

            int mid = start + (end - start) / 2;
            if ( arr[mid] == target ){
                return mid ;
            }
            // for ascending arr
            if ( asc == true) {
                //left side
                if (arr[mid] > target) {
                    end = mid - 1;

                }
                // right side
                else {
                    start = mid + 1;
                }
            }
            //for desc arr :
            else {
                //left side
                if (arr[mid] < target) {
                    end = mid - 1;

                }
                // right side
                else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
