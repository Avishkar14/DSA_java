class Q_342_PowOf4_Rec {
    //psvm
    public static boolean isPowerOfFour(int n) {
        return helper( n , 0);
    }
    public boolean helper( int n , int pow ){
        if( pow == 0){
            if( n == 1){
                return true;
            }
        }
        if( n == Math.pow(4, pow)){
            return true;
        }
        else if( n < Math.pow(4, pow) ){
            return false;
        }

        return helper( n , pow+1);
    }
}
