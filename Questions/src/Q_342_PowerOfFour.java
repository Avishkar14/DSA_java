class Q_342_PowerOfFour {
    //psvm will come here
    public static boolean isPowerOfFour(int n) {
        if( n < 1){
            return false;
        }
        if( n == 1 ){   //as 4^0 = 1
            return true;
        }
        int i = 1;
        // int pow = 4*i;
        while( n >= Math.pow( 4 , i) ){
            if( n / Math.pow( 4 , i) == 1){
                return true;
            }
            i++;
        }
        return false;
    }
}
