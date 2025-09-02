import java.util.Arrays;
// Index out of bound for 5 , 12 so fix this error
public class BS_2DMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                { 1 , 2 , 3 },
                { 4 , 5 , 6 },
                { 7 , 8 , 9 },
                { 10, 11, 12 }
        } ;
        int target = 3;
        System.out.println(Arrays.toString(Search(matrix , target)));
    }
    static int[] Search( int[][] matrix , int target){

        int r = 0;
        int c = 0;
        int flag = 0;
        int end = matrix.length-1;
        int c_end = matrix[r].length-1;

        while( flag != 1){
            int[] mid = {( r + (end/2 - r/2)) , c };
            int[] c_mid = { r , ( c + (c_end/2 - c/2)) };

            if( target == matrix[mid[0]][mid[1]] || target == matrix[c_mid[0]][c_mid[1]] ){
                //found
                if( target == matrix[c_mid[0]][c_mid[1]] ){
                    mid[0] = c_mid[0];
                    mid[1] = c_mid[1];
                }
                flag = 1 ;
                return new int[]{ mid[0] , mid[1] };
            }
            if ( target < matrix[mid[0]+1][mid[1]] && target > matrix[mid[0]][mid[1]]) {
                // now search in the row with index fixed which is "mid[0] + 1 " and change col index.
                if (target == matrix[c_mid[0]][c_mid[1]]) {
                    mid[0] = c_mid[0];
                    mid[1] = c_mid[1];
                    flag = 1 ;
                    return new int[]{mid[0], mid[1]};
                }
                if (target < matrix[c_mid[0]][c_mid[1]]) {
                    c_end = c_mid[1] - 1;
                } else if (target > matrix[mid[0]][mid[1]]) {
                    c = c_mid[1] + 1;
                }
            }
            else if ( target > matrix[mid[0]][mid[1]] ) {
                r = mid[0] + 1;
            }
            else if( target < matrix[mid[0]][mid[1]] ){
                end = mid[0] - 1;
            }
//            if(r > end || c > c_end){
//                flag = 1;
//            }
        }
        return new int[]{-1,-1};
    }
}
