import java.util.Arrays;

public class RecPatt_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1 , 5, 3, 2, 4 , 0};
        SelSort( arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void SelSort( int[] arr, int r, int c, int max){
        if( r == 0){
            return;
        }
        if( c <= r){
            if( arr[max] < arr[c]){
                max = c;
            }
            SelSort(arr, r, c+1, max);
            if( c == r ){
                //last index : then swap with max
                int temp = arr[max];
                arr[max] = arr[c];
                arr[c] = temp;
                max = 0;
                SelSort(arr, r -1, 0 , max);
            }
        }
    }
}
