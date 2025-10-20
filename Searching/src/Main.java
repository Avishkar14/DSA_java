import java.util.Arrays;

//Bubble sort code:
public class Main {
    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort( int[] arr){
        for( int i = 0; i < arr.length ; i++){
            for( int j = 0; j < arr.length - i - 1 ; j++){
                if( arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}