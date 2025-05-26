import java.util.Arrays;

public class MaxArrElem {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=11;
        arr[2]=12;
        arr[3]=10;
        arr[4]=9;
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));


    }
    static int max(int[] arr){
        int max=arr[0];
        for (int i=0; i<arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
