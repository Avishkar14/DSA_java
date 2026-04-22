import java.util.ArrayList;
import java.util.List;

class Q_73_SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        List<List<Integer>> zeroIndexes = new ArrayList<>();

        //traverse and find indexes
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if( matrix[i][j] == 0){
                    List<Integer> indexes = new ArrayList<>();
                    indexes.add(i);
                    indexes.add(j);
                    zeroIndexes.add(indexes);
                }
            }
        }

        //Now make i and j 's as 0's;
        for (int i = 0; i < zeroIndexes.size(); i++) {
            List<Integer> indexes = zeroIndexes.get(i);
            
            int row = indexes.get(0);
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row][j] = 0;
            }

            int col = indexes.get(1);
            for(int j = 0; j < matrix.length; j++){
                matrix[j][col] = 0;
            }
        }

        return;

    }
}
