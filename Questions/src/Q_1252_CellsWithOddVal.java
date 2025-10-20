<<<<<<< Updated upstream
public class Q_1252_CellsWithOddVal {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] indices= {  { 0, 1 } ,
                            { 1, 1 } };
        System.out.println(oddCells(m , n , indices));
    }
        public static int oddCells(int m, int n, int[][] indices) {
            int[][] matrix = new int[m][n];
            //indices check and inc. that row / col
            //for indices
            for( int coli = 0; coli < indices.length ; coli++){
                //for the row
                for( int rowi = 0; rowi < indices[coli].length ; rowi++){
                    int index = 0;
                    int col = 0;
                    if( rowi == 0){
                        //index got are for row inc
                        index = indices[coli][rowi];
                        for(; col < n ; col++){
                            //here row = index
                            matrix[index][col]++;
                        }
                    }
                    else{
                        //rowi == 1
                        // index for col inc

                        for( int row = 0; row < m ; row++){
                            //here col = index
                            index = indices[coli][rowi];
                            matrix[row][index]++;
                        }
                    }

                }

            }
            //now calculate the odd no. in matrix
            int count = 0;
            for( int row = 0; row < m ; row++){
                for( int col = 0; col < n ; col++){
                    if( matrix[row][col] % 2 != 0 ){
                        count++;
                    }

                }

            }
            return count;
        }

}
=======
public class Q_1252_CellsWithOddVal {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] indices= {  { 0, 1 } ,
                            { 1, 1 } };
        System.out.println(oddCells(m , n , indices));
    }
        public static int oddCells(int m, int n, int[][] indices) {
            int[][] matrix = new int[m][n];
            //indices check and inc. that row / col
            //for indices
            for( int coli = 0; coli < indices.length ; coli++){
                //for the row
                for( int rowi = 0; rowi < indices[coli].length ; rowi++){
                    int index = 0;
                    int col = 0;
                    if( rowi == 0){
                        //index got are for row inc
                        index = indices[coli][rowi];
                        for(; col < n ; col++){
                            //here row = index
                            matrix[index][col]++;
                        }
                    }
                    else{
                        //rowi == 1
                        // index for col inc

                        for( int row = 0; row < m ; row++){
                            //here col = index
                            index = indices[coli][rowi];
                            matrix[row][index]++;
                        }
                    }

                }

            }
            //now calculate the odd no. in matrix
            int count = 0;
            for( int row = 0; row < m ; row++){
                for( int col = 0; col < n ; col++){
                    if( matrix[row][col] % 2 != 0 ){
                        count++;
                    }

                }

            }
            return count;
        }

}
>>>>>>> Stashed changes
