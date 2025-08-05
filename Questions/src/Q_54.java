//54. Spiral matrix
import java.util.ArrayList;
import java.util.List;

public class Q_54 {
    public static void main(String[] args) {
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

        return ans;
    }
}