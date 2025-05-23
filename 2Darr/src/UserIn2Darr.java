import java.util.Arrays;
import java.util.Scanner;

public class UserIn2Darr {
    public static void main(String[] args) {
        System.out.println("Enter no of rows :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][];

        int row;
        for(row = 0; row < n; ++row) {
            System.out.println("enter no. of elements(columns) in row " + row + " :");
            int TotalCol = in.nextInt();
            arr[row] = new int[TotalCol];

            for(int col = 0; col < TotalCol; ++col) {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("2D array is :");

        for(row = 0; row < n; ++row) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}