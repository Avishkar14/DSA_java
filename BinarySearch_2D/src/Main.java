import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matrix= {
                { 10 , 20 , 30 },
                { 12 , 22 , 33 },
                { 15 , 26 , 37 },
                { 19 , 28 , 40 }
        } ;
        int target = 26;
        System.out.println(Arrays.toString(BinarySearch(matrix , target)));
    }
     static int[] BinarySearch( int[][] matrix , int target){
        int r = 0;
        int c = matrix[r].length-1;

        while( r < matrix.length && c >= 0 ) {
            if (target == matrix[r][c]) {
                return new int[]{r, c};
            }
            if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }

        return new int[]{-1,-1};
     }

}