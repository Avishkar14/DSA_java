import java.util.Arrays;

class Q_566_ReshapeMat {
    public static void main(String[] args) {
//        int[][] mat = {{ 0, 1},
//                       { 2, 3},
//                        {4, 5}};  // use ip: (mat , 2, 3)
        int[][] mat = {{ 0, 1},
                       { 2, 3}};    // use ip: (mat , 1, 4)
        System.out.println(Arrays.deepToString(matrixReshape( mat , 1, 4)));

    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMat = new int[r][c];

        if( mat.length*mat[0].length == newMat.length*newMat[0].length &&
            mat.length != newMat.length ){
                int count = 0;
                for(int row = 0; row < mat.length; row++){
                    for(int col = 0; col < mat[0].length; col++){
//                        int newCol = ((mat[0].length - 1)*row + row + col);
//                        int newRow = newCol / (newMat[0].length + 1);
//
//                        newMat[newRow][newCol] = mat[row][col];
                        int newCol = count%c;
                        int newRow = count/c;
                        newMat[newRow][newCol] = mat[row][col];
                        count++;
                    }
                }

                return newMat;
        }

        //else return original matrix;
        return mat;
    }
}