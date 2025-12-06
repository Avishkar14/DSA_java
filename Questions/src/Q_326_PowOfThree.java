class Q_326_PowOfThree {
//psvm here remain
    public static boolean isPowerOfThree(int n) {
        if( n < 1){
            return false;
        }
        if( n == 1 ){   //as 3^0 = 1
            return true;
        }
        int i = 1;
        // int pow = 3*i;
        while( n >= Math.pow( 3 , i) ){
            if( n / Math.pow( 3 , i) == 1){
                return true;
            }
            i++;
        }
        return false;

    }
}
