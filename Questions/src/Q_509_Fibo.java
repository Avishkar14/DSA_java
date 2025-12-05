public class Q_509_Fibo {
    public static void main(String[] args) {
        System.out.println(fib(5)); //0 , 1 , 0+1=1 , 2 , 3 , 5 , 8 , 13
                // elements index (n) = 0th 1st  2nd   3rd  4th  5th
    }
        public static int fib(int n) {
            int temp = 0;
            int a = 0;  //1st elem
            int b = 1;  //2nd elem
            if( n == 0){
                return 0;
            }
            for( int i = 0; i < n - 1; i++ ){
                // sum += sum;
                temp = b;
                b = a + b;
                a = temp;

            }
            return b;
        }
}
