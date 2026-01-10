class Q_231_PowOfTwo_Rec {
    //psvm
    public static boolean isPowerOfTwo(int n) {
      //Using recursion
        int pow = 0;
        return helper(n , pow);
    }

    boolean helper( int n , int pow){
        if( n < Math.pow(2 , pow)){
            return false;
        }
        if( n == Math.pow(2, pow)){
            return true;
        }
        return helper(n , pow + 1);
    }
}
