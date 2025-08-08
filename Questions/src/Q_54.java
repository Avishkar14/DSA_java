<<<<<<< Updated upstream
//54. Spiral matrix
=======
//Q/.. 54 Spiral Matrix
>>>>>>> Stashed changes
import java.util.ArrayList;
import java.util.List;

public class Q_54 {
    public static void main(String[] args) {
<<<<<<< Updated upstream
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int row =0 , col=0;
        List<Integer> ans= new ArrayList<>();

        while( row <= 0 ){
        if( row == 0 ){
            for (; col <= matrix[row].length-1 ; col ++ ){
               ans.add(matrix[row][col]);
               col = matrix[row].length-1;
            }
        }
        else if( row > 0 ){
            col = matrix[row].length-1;
            for( ; row <= matrix.length -1 ; row++ ){
                ans.add(matrix[row][col]);
            }
            if( row == matrix.length -1){
                for( ; col <= matrix.length -1 ; col-- ){
                    ans.add(matrix[row][col]);
                }
            }
        }
        }

=======
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println(":" + spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int row = 0, col = 0;
        int down = 0, right = 0;
        int left = 0;
        int up;

        List<Integer> ans = new ArrayList<>();

//        for (int i = 0; i < (matrix.length * matrix[row].length); i++) {
//
//            if (row == 0) {
//                for (; right < matrix[row].length; right++) {
//                    ans.add(matrix[row][right]);
//                    i++;
//                }
//                col = right;
//                row++;
//            } else if (col == right) {
//                for (; down < matrix.length; down++) {
//                    ans.add(matrix[down][col]);
//                    i++;
//                }
//                row = down;
//                col++;
//            } else if (row == down) {
//                for (left = matrix[row].length - 1; left >= 0; left--) {
//                    ans.add(matrix[row][left]);
//                    i++;
//                }
//                col = left;
//                row++;
//            } else if (col == left) {
//                for (up = matrix.length - 1; up >= 0; up--) {
//                    ans.add(matrix[up][col]);
//                    i++;
//                }
//                row = up;
//                col++;
//            }
//
//        }
        for (int i = 0; i < (matrix.length * matrix[row].length); i++){
            for (; right < matrix.length ; right++ ){
                col=right;
                ans.add(matrix[row][col]);
            }
            if(row==0 && col == right) {
                ++down;
            }
            else{
                for (; down < matrix[row].length; down++) {
                    row = down;
                    ans.add(matrix[row][col]);
                }
            }

            for(left = matrix[row].length - 1; left >= 0; left--){
                col=left;
                ans.add(matrix[row][col]);
            }
            for( up = matrix.length-1 ;up >=0 ; up--){
                row = up;
                ans.add(matrix[row][col]);
            }
        }
>>>>>>> Stashed changes
        return ans;
    }
}