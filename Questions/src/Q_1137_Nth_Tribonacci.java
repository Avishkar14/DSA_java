class Q_1137_Nth_Tribonacci {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
    public static int tribonacci(int n) {
        int ans = 0;
        int[] arr = new int[n+1];
        for( int i = 0; i <= n; i++){
            if( i == 0){
                arr[i] = 0;
            }
            else if( i == 1 || i == 2){
                arr[i] = 1;
            }
            
            if( i > 2){
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
            if( i == n){
                ans = arr[i];
            }
        }
        return ans;
    }
}