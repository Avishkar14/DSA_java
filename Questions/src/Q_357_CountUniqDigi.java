class Q_357_CountUniqDigi {
    public static int countNumbersWithUniqueDigits(int n) {
        //store repeat elements count in arr:
        int[] arr = new int[9];

        arr[0] = 1;
        if( n == 0 ){
            return 1;
        }
        
        int i = 1;
        while( i <= n ){
            if( i == 1){
                arr[i] = 9;
            }
            else{
                arr[i] = arr[i - 1]*( 11 - i);
            }
            i++;
        }
        
        int num = (int)Math.pow(10 , n);
        int repeat = 0;
        for(int j = 0; j <= n; j++){
            repeat += arr[j];
        }

        return repeat;
    }
}
