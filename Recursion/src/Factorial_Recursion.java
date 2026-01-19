public class Factorial_Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    static int factorial(int n){
        //my way
        if( n == 0){
            //I guess this is not reachable its just case if i/p is "0"
            return -1;
        }
        if( n <= 1 ){
            return n;
        }

        return n *= factorial(n-1);
        //KK way (much better and simpler)
        /* if( n <= 1 ){
               return 1;}
         return n * factorial(n-1);
         */

    }
}
