import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5 , 3 , 1 , 2 , 4 };
        int i = 0;
        while( i != arr.length - 1){
//            for arr[i] the index i is equal to arr[i] - 1 then i++
            if( i == arr[i] - 1 ){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}