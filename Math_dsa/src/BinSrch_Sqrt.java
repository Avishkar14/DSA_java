public class BinSrch_Sqrt {
    public static void main(String[] args) {
        int n = 40;
        int decimal = 3;
        System.out.println(Newtonsqrt(n));
        //pretty print:
        System.out.printf("%3f" , sqrt(n,decimal));
    }

    private static double sqrt(int n, int decimal) {
        int s=0;
        int e=n;
        double root = 0.0;
        while( s <= e){
            int mid = e - (e-s)/2;

            if( mid*mid == n ){
                root = mid;
                return root;
            }
            if( mid * mid > n){
                e = mid - 1;
            }
            else{
                s = mid+1;
            }
            double incr = 0.1;
            for (int i = 0; i < decimal; i++) {
                while( root*root <= n ){
                    root += incr;
                }
                root -= incr;
                incr /= 10;
            }
        }
        return root;
    }
    static double Newtonsqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 *(x + (n/x));

            if(Math.abs(root - x) < 0.5){
                break;
            }

            x= root;
        }
        return root;
    }
}
