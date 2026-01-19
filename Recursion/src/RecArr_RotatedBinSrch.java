public class RecArr_RotatedBinSrch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 1, 2};
        System.out.println(bin_srch(arr, 1, 0 , arr.length));
    }

    static int bin_srch(int[] arr, int target, int s, int e ){
        if( s > e){
            return -1;
        }
        int m = e - (e-s)/2;
        if( arr[m] == target){
            return m;
        }
        if( arr[s] <= arr[m]){
            //means lhs side is sorted like s = 3 and mid = 7 .
            if( target >= arr[s] && target <= arr[m]){
//                search on left side
//                 e = m -1;
                //ie in recursion form:
               return bin_srch(arr, target,s , m-1);
            }
            else{
//                else right side
//                s = m+1;
                return  bin_srch(arr, target,m+1 , e);
            }
        }
        //why not else{} here for this case?
//        else{
            if( target >= arr[m] && target <= arr[e]){
                return bin_srch(arr, target , m+1 , e );
            }
//        }

        return bin_srch(arr, target , s , m - 1);
    }
}
