import java.util.Arrays;

class Q_48_RotateImg_2ndattempt {
    public static void main(String[] args) {
        int [][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16 }
        };
        rotate(matrix);
        System.out.println(Arrays.deepToString( matrix ));
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        // int left = 0, down = 0;
        // int right = n; up = n;
    //     for(int row = 0; row <= n; row++){
    //         for( int col = 0; col <= n - 1; col++){
    //             swap( matrix , row, col , col,n - row );
    //         }
    //     }
    //     swap( matrix , n,0 , n,n );
    // }
    int i = 0; //to track loops
    for( int row = 0; row < n/2+ 1; row++ ){
        
        for( int col=0 + i; col < n - i; col++ ){
            // down++;                //row: 0, 1, 2; col = n
            swap( matrix , row , col , col , n - i);
        }
        for( int col=0+ i; col < n - i; col++ ){
            // right--;
            swap( matrix , row , col , n - i, n - col);
        }
        for( int col=0 + i; col < n - i; col++ ){
            // up--;
            swap( matrix , row , col , n - col , 0 + i);
        }
        i++;
    }
}

    static void swap( int[][] matrix , int row1 , int col1, int row2, int col2 ){
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }
}