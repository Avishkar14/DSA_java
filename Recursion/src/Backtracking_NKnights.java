public class Backtracking_NKnights {
    // Error in prog outputs , Needs to do again :
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        NKnights( board, 0, 0, 4);

    }

    static void NKnights( boolean[][] board, int row, int col, int knights){

        if( knights == 0 ){
            display(board);
            System.out.println();
            return;
        }

        if( row == board.length -1 && col == board.length - 1){
            return;
        }

        if( col == board.length - 1){
            NKnights(board, row + 1, 0, knights);
        }

        for (; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                NKnights( board, row, col+1, knights-1);
                board[row][col] = false;//undo changes
            }
        }
    }

    static boolean isSafe( boolean[][] board, int row, int col){

        //when isValid is true then we will check if that cell is false or true if false then element can be placed
        if( isValid(board, row - 2, col - 1) ){
            if( board[row - 2][col - 1]){
                return false;
            }
        }
        if( isValid(board, row - 2, col + 1) ){
            if( board[row - 2][col + 1]){
                return false;
            }
        }
        if( isValid(board, row - 1, col - 2) ){
            if( board[row - 1][col - 2]){
                return false;
            }
        }
        if( isValid(board, row - 1, col + 2) ){
            if( board[row - 1][col + 2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid( boolean[][] board, int row, int col){
        if( row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    static void display( boolean[][] board){
        for( int row = 0; row < 4; row++){
            for (int col = 0; col < 4; col++) {
                if( board[row][col]) {
                    //if its true print K
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
