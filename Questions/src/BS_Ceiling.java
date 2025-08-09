public class BS_Ceiling {
    public static void main(String[] args) {
        int[] arr={ 1, 2, 3, 5};
        int target=4;
        System.out.println(BinarySearch(arr, target));
    }

    public static int BinarySearch(int[] arr, int target){
        int start=0, end = arr.length -1 ;
//        int index=0;
        while(start<=end){
            int mid = start + ( end - start )/2;

            if ( arr[mid] > target ) {
                end = mid -1;
            }
            else if ( arr[mid] < target) {
                start = mid+1;
            }
            else {

                return arr[mid+1];

            }
            //index=arr[mid];
        }

        return arr[start]; //this for ceiling
        //and return arr[end] for floor.
    }
}
