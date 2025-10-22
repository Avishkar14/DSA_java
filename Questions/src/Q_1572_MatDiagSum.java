class Q_1572_MatDiagSum {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1, 1},
                { 1, 1, 1, 1},
                { 1, 1, 1, 1},
                { 1, 1, 1, 1}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int start = 0;
        int end = mat.length-1;
        for (int i = 0; i < mat.length; i++) {

            if(start == end){
                sum += mat[start][end];
            }
            else{
                sum += mat[i][start] + mat[i][end];
            }
            start++;
            end--;

        }
        return sum;
    }
}