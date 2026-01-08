class Q_509_FiboNo_rec {
    //psvm
    public static int fib(int n) {
        //using recursion:
        if( n < 2){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
