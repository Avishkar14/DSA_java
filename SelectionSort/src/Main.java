import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 10 , -12 , 3 , 1 , 0 , 4};
//        int max = 0;
        int start = 0;
        int end = arr.length - 1;
        while( end >= start ){
            //find max function : and it will return the index of max term
            int index = max(start , end , arr);

            //now we will swap to last position:
            int temp = arr[index];
            arr[index] = arr[end];
            arr[end] = temp;
            end--;

        }
//        System.out.println(max(start , end , arr));
        System.out.println(Arrays.toString(arr));
    }

    static int max(int start , int end , int[] arr){
        int MaxIndex = 0;
        int peak = 0;
        for (int i = start ; i <= end; i++) {
            if( arr[i] >= peak){
                peak = arr[i];
                MaxIndex = i;
            }

        }
       return MaxIndex;
    }
}