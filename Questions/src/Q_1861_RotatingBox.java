import java.util.Arrays;

class Q_1861_RotatingBox {
    public static void main(String[] args) {
        char[][] boxGrid = {
                {'#', '#', '*', '.', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}
        };


        char[][] result = rotateTheBox(boxGrid);

        for (char[] row : result) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] rotated = new char[n][m];
        
        //to keep track of 1st stationary obj occuring in row :
        int[] block_first = new int[m];
        Arrays.fill(block_first, -1);

        //To keep track of rocks in 
        //first find stationary obj(*) and fill all with empty(.):
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if( boxGrid[i][j] == '*' ){
                    rotated[j][m - 1- i] = '*' ;

                }
                else if(boxGrid[i][j] == '#' ){
                    rotated[j][m - 1- i] = '#' ;
                }
                else{
                    
                    rotated[j][m - 1- i] = '.' ;
                }
            }
        }

        //Now assign rocks at rotated place until end or rock or block is found:
        //use swap function:
        // System.out.print("m :"+ m +" , "+n);
        for( int i = 0; i < m; i++ ){
            int j = n - 1; //for row from bottom:
            while( j >= 0 ){
                if( rotated[j][i] == '.' ){
                    //Should not be object and first store occurance: 
                    int k = j;
                    while(k >= 0 && rotated[k][i] != '*' && rotated[k][i] != '#' ){
                        k--;
                    }
                    //when broke loop then if its at stone then swap else obj occured and
                    //  start finding empty again in loop after * occur and greater than 0: 
                    if(k >= 0 && rotated[k][i] == '#' ){
                        //swap with j = empty :
                        swap( rotated , k , j , i );
                        // j = k;
                    }
                    else{
                        //obj occured
                        // k--;
                        j = k;
                    }
                }
                j--;
            }
            
        }

        return rotated;
    }
// swap( rotated , k , j , m )
    public static void swap(char[][] rotated, int a, int b, int i){
        //swap when row = a with row = b:
        char temp = rotated[a][i];
        rotated[a][i] = rotated[b][i];
        rotated[b][i] = temp;
    }
}