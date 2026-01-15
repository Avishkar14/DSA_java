class Q_70_ClimbingStairs {
    public static int climbStairs(int n) {
        //psvm
        // it is like fibo : F( N - 1)+ F( N - 2)
        // 0 , 1 , 2, 3, 5 , 8, 
        int[] ans = new int[n+1];
        for( int i = 0; i <= n; i++ ){
            if( i == 0){
                ans[i] = 0;;
            }
            else if( i == 1 ){
                ans[i] = 1;
            }
            else if( i == 2){
                ans[i] = 2;
            }
            else{
                // n > 2
                ans[i] = ans[i-1] + ans[ i -2];
            }
            
        }
        return ans[n];
    }
}
