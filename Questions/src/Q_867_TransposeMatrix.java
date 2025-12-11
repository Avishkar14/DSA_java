import java.util.Arrays;

public class Q_867_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix= {{ 1 , 2, 3},
                         { 4, 5, 6}};
//                        { 7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] new_mat = new int[matrix[0].length][matrix.length];
        int count = 0;
        for( int col = 0; col < matrix[0].length; col++){
            for( int row = 0; row < matrix.length; row++){
                int new_row = count/matrix.length;
                int new_col = count % matrix.length;
                new_mat[ new_row ][ new_col ] = matrix[row][col];
                count++;
            }
        }
        return new_mat;
    }
}