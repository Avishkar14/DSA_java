import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter length of an array : ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] arr = new int[input];

        int len;
        for(len = 0; len < arr.length; ++len) {
            System.out.println("Enter value for  index: " + len);
            arr[len] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("enter length of String array :");
        len = in.nextInt();
        String[] str = new String[len];

        for(int j = 0; j < str.length; ++j) {
            str[j] = in.next();
        }

        System.out.println("array of Strings is :");
        System.out.println(Arrays.toString(str));
    }
}