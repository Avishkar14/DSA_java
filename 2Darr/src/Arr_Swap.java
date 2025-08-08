import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_Swap {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,3};
//        System.out.println("array is :"+Arrays.toString(arr));
//
//        Scanner in=new Scanner(System.in);
//
//        System.out.println("enter index of element to be swapped:");
//        int a=in.nextInt();
//
//        System.out.println("enter index of element to get swapped with :");
//        int b=in.nextInt();
//        swap(arr, a,b);
        //swapped array
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString( arr));

    }
    static void swap(int[] arr, int a , int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

//    static void reverse(int[] arr){
//        for (int i=1; i< arr.length; i++){
//            System.out.println(arr[arr.length-i]);
//        }
//
//    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        int temp;
//        for (int i=0; i<arr.length; i++){
//           swap(arr, start, end);
//            start=start+1;
//            end=end-1;
//        }
//        System.out.println(arr);

        while(start<end){
            swap(arr, start, end);
            start=start+1;
            end=end-1;
        }

    }
}
