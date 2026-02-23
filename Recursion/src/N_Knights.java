public class N_Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Nknights( board, 0, 0, n);
    }

    static void Nknights(boolean[][] board, int row, int col, int knights){
        if( knights == 0 ){
            display(board);
            System.out.println();
            return;
        }

        if( row == board.length - 1 && col == board.length){ //If your col is out of bound when row is last one then just skip i.e, return.
            return;
        }

        if( col == board.length ){
            Nknights( board, row + 1, 0, knights );
            return;
        }

//        for( int c = col; c < board.length; c++){
//            if( !board[row][col]){
                if(isSafe( row, col, board)){
                    //if isSafe is true that means we can put knight on that cell.
                    board[row][col] = true;
                    Nknights( board, row, col+1, knights-1);
                    //undo the changes made:
                    board[row][col] = false;
                }
//            }
        //If its not safe just move ahead to next column and not reduce knight.
            Nknights( board, row, col+1, knights);

//        }
    }

    static boolean isSafe( int row, int col , boolean[][] board ){
        //Now there will be 4 conditions :
        if( isValid( row - 2, col - 1 , board) ){
            //if cell coordinates ie row and column are valid like they are not index out of bound , also no already existing knight
            // then we can put there knight which is check in if(board[r][c]){}
            if( board[row - 2][col - 1]){
                //if( board[row - 2][col - 1]) is true means knight exist on that cell then return false;
                return false;
            }
        }
        if( isValid( row - 2, col + 1, board)){
            if( board[row - 2][ col + 1]){
                return false;
            }
        }
        if( isValid( row - 1, col - 2, board)){
            if( board[row - 1][ col - 2]){
                return false;
            }
        }
        if( isValid( row - 1, col + 2, board)){
            if( board[row - 1][ col + 2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid( int row, int col, boolean[][] board){
        if( row >= 0 && row < board.length &&  col >= 0 && col < board.length)
            return true;

        return false;
    }

    static void display(boolean[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if( board[row][col]){
                    System.out.print(" K ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
