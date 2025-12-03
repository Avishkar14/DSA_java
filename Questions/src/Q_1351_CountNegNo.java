class Q_1351_CountNegNo {
    public static void main(String[] args) {
        int[][] grid = { {1,0,-1},
                         {2,-1,-2} };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = grid[0].length - 1; col > -1;col--){
                if( grid[row][col] < 0){
                    count++;
                }
                else{
                    // grid = 0 or > 0; then break?;
                    break;
                }
            }
        }
        return count;
    }
}