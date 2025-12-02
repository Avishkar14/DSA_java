import java.util.ArrayList;
import java.util.List;
public class Q_54_Spiral_matx {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3 , 4}, { 5, 6 , 7, 8},{ 9 , 10 , 11, 12 }};
//        int[][] matrix = {{1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
        System.out.println(spiralOrder(matrix));
    }

//    public static List<Integer> spiralOrder(int[][] matrix) {
//        int row = 0 , col= 0;
//        int right = 0 , left = 0, up = 0, down = 0;
//        List<Integer> ans = new ArrayList<Integer>();
//
//        while( ans.size() != matrix.length*matrix[0].length  ){
//
//            if( row == 0 && col == 0){
//                for(;right < matrix[0].length; right++){
//                    ans.add(matrix[row][right]);
//                }
//                col = right - 1;
//                row++;
//            } else if ( row > 0 && col == right - 1) {
//                down = row;
//                for(; down < matrix.length; down++){
//                    ans.add(matrix[down][col]);
//                }
//                row = down - 1 ;
//                col--;
//            } else if (col < matrix.length && row == down - 1 ) {
//                left = col;
//                for(;left >= 0; left--){
//                    ans.add(matrix[row][left]);
//                }
//                col = left + 1;
//                row--;
//            } else if ( col == left + 1 && row < matrix.length) {
//                up = row;
//                for(; up >= left + 1 ; up--){
//                    ans.add(matrix[up][col]);
//                }
//                row = up + 1 ;
//                col++;
//            }
//        }
//        return ans;
//    }

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();

        int Sc = 0 , Sr= 0;
        int Ec = matrix[0].length - 1 , Er = matrix.length - 1;

        while( ans.size() < matrix[0].length*matrix.length ){

            for (int col = Sc; col <= Ec ; col++) {
                if(ans.size() == matrix[0].length*matrix.length){
                    return ans;
                }
                ans.add( matrix[Sr][col]);
            }
            Sr++;

            for (int row = Sr; row <= Er; row++) {
                if(ans.size() == matrix[0].length*matrix.length){
                    return ans;
                }
                ans.add( matrix[row][Ec]);
            }
            Ec--;


            for (int col = Ec; col >= Sc ; col--) {
                if(ans.size() == matrix[0].length*matrix.length){
                    return ans;
                }
                ans.add( matrix[Er][col]);
            }
            Er--;

            for (int row = Er; row >= Sr; row--) {
                if(ans.size() == matrix[0].length*matrix.length){
                    return ans;
                }
                ans.add( matrix[row][Sc]);
            }
            Sc++;
        }
        return ans;
    }

}
