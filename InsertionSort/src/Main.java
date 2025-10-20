import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 8, 7, 10, 1, -1 , 0 };

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i+1 ; j > 0; j--) {

                if( arr[j - 1] > arr[j] ){
//                  swap
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr  ));
    }

}