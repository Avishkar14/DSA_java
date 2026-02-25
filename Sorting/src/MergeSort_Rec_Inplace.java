import java.util.Arrays;

public class MergeSort_Rec_Inplace {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 5, 3, 1, 9, 4};
        mergeSortInplace(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInplace(int[] arr, int s , int e){
        if(e - s == 1){
            return ;
        }

        int mid =  (e - s)/2 + s;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e );

        mergeInplace(arr ,s, mid, e);
    }

    static void mergeInplace(int[] arr, int s, int m , int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while( i < m && j < e){
            if( arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //possible that one of array is finished before
        // 2nd one is completely put in mix.So copy remain elem.
        while( i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while( j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for( int l = 0; l < mix.length; l++ ){
            arr[s + l] = mix[l];
        }
    }
}
