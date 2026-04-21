import java.util.Arrays;

class Q_59_SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(4)));
    }
    public static int[][] generateMatrix(int n) {
        int left = 0, right = n - 1, up = 0, down = n - 1, i = 0, j = 0;
        int[][] ans = new int[n][n];
        int val = 1;

        while( val <= n*n){

            for(; j <= right; j++){
                if( ans[i][j] == 0 ){
                    ans[i][j] = val;
                    val++;
                }
            }
            j = right;
            right--;

            for(; i <= down; i++){
                if( ans[i][j] == 0 ){
                    ans[i][j] = val;
                    val++;
                }
            }
            i = down;
            down--;

            for(; j >= left; j--){
                if( ans[i][j] == 0 ){
                    ans[i][j] = val;
                    val++;
                }
            }
            j = left;
            left++;

            for(; i >= up; i--){
                if( ans[i][j] == 0 ){
                    ans[i][j] = val;
                    val++;
                }
            }

            up++;
            i = up;
        }

        return ans;
    }
}