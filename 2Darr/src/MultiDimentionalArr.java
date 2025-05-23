import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];

        int row;
        for(row = 0; row < arr.length; ++row) {
            for(int col = 0; col < arr[row].length; ++col) {
                arr[row][col] = in.nextInt();
            }
        }

        for(row = 0; row < arr.length; ++row) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}