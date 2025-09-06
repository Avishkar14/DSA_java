import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q.1380. Lucky Numbers in a Matrix :

public class Q_1380_LuckyNoArr {
    public static void main(String[] args) {
        int[][] matrix = {  {3, 6},
                            {7, 1},
                            {5, 2},
                            {4, 8}};
        System.out.println(luckyNum(matrix));
    }

        public static List<Integer> luckyNum(int[][] matrix){
        ArrayList<Integer> ans = new ArrayList<>();
        // first we find min element in row and then find max in that row
            int row = 0;


            int flag = 0;
            while( flag != 1 ) {
                int count = 0;
                int col = 0;
                for (int i = 0; i < matrix[row].length; i++) {
                    // row same ; col ++
                    //let r,c = 0,0 be min elem of row 0;
                    int min = matrix[row][col];
                    if (min >= matrix[row][i]) {
                        min = matrix[row][i];
                        col = i;
                    }
                }
                // now we got min for row = 0 and curr col = i;
                //we now compare it in that col if it is max element?
                for (int j = 0; j < matrix.length ; j++) {
                    // for col max comparison
                    if (matrix[row][col] < matrix[j][col] ) {
                        //fail case so break;
//                    max = matrix[j][col];
//                    row = j;
                        row++;
                        break;
                    } else {
                        // means min > elem of same col
//                        row = j;
//                        max = matrix[row][col];
//                        ans.add(max);
//                        flag = 1;
                        count ++;

                    }
                }
                if( count == matrix.length ){
                    ans.add(matrix[row][col]);
                    flag = 1;
                }
                if( row >= matrix.length){
                    flag = 1;
                }

            }

        return ans;
        }

}
