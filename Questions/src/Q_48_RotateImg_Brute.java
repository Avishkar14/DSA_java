import java.util.Stack;

class Q_48_RotateImg_Brute {
        public static void rotate(int[][] matrix) {
            Stack<Integer> stack = new Stack<>();
            int n = matrix.length;

            for(int col = n - 1; col >= 0; col--  ){
                for( int row = 0; row < n; row++ ){
                    stack.push(matrix[row][col]);
                }
            }
            //now put by popping:
            for(int row = 0; row < n; row++){
                for( int col = 0; col < n; col++){
                    matrix[row][col] = stack.pop();
                }
            }
        }

    }