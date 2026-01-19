import java.util.Arrays;

public class RecPatt_BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1 , 5, 3, 2, 4 };
        BubSort(arr ,arr.length -1 , 0);
        System.out.println(Arrays.toString(arr));
    }

    static void BubSort( int[] arr, int r, int c){
        if( r == 0){
            return;
        }
        if(c < r){
            if( arr[c] >  arr[c+1] ){
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            BubSort( arr, r, c+1);
        }

        else{
            BubSort( arr, r -1 , 0);
        }
    }
}
