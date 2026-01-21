class Q_PowOfThree_Rec {
    //psvm
    public static boolean isPowerOfThree(int n) {
        return helper( n, 0);
    }
    public static boolean helper( int n , int pow ){
        if( pow == 0){
            if( n == 1){
                return true;
            }
        }
        if( n == Math.pow(3, pow)){
            return true;
        }
        else if( n < Math.pow(3, pow) ){
            return false;
        }

        return helper( n , pow+1);
    }
}
