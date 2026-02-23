public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board, 0, 0);
    }
    public static void solveSudoku(char[][] board, int row, int col) {
        if( row == board.length - 1 && col == board.length - 1 && board[row][col] != '.'){
            display(board);
            System.out.println();
            return;
        }
        if( col == board.length){
            solveSudoku( board, row+1, 0);
            return;
        }
        if(board[row][col] == '.'){
            for( char i = '1'; i <= '9'; i++ ){
                if( isSafe(board, row , col, i) ){
                    //if cell is valid that is follows 3 req conditions then can put i there.
//                    board[row][col] = (char) (i - '0');
                    board[row][col] = i;
                    solveSudoku( board, row , col + 1);
                    board[row][col] = '.';
                }
            }
            //if all i checked but no one fits then?
            //"." exists but is not safe and all 9 num tried:
//            board[row][col - 1] = '.';
            return;
        }
        //Below is useful when there already element exists on place and we need to move forward.
        solveSudoku( board, row , col + 1);
    }

    static boolean isSafe(char[][] board, int row, int col, char i){
//        if( board[row][col] != '.'){
//            return false;
//        }
        //check for row
        for( int c = 0; c < 9; c++){
            if( board[row][c] == i){
                return false;
            }
        }
        //check for col
        for( int r = 0; r < 9; r++){
            if( board[r][col] == i){
                return false;
            }
        }
        //check 1 block:
        for( int r = (row/3)*3; r <(row/3)*3+3; r++){
            for( int c = (col/3)*3; c <(col/3)*3+3; c++){
                if( i == board[r][c] ){
                    return false;
                }
            }
        }

        return true;
    }
    static void display( char[][] board){
        for( int row = 0; row < 9; row++){
            for( int col = 0; col < 9; col++){
                System.out.print(" " + board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
