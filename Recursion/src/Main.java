public class Main {
    public static void main(String[] args) {
//        print1(1);
        print(1);
    }

//    Without using only one fxn to simulate recursion
    static void print1( int n){
        System.out.println(n);
        print2(2);
    }
    static void print2( int n){
        System.out.println(n);
        print3(3);
    }
    static void print3( int n){
        System.out.println(n);
    }

//    Using one fxn , exact recursion used
    static void print(int n){
//        Base condition to stop recursive calls and avoid stack overflow
        if( n == 3){
            System.out.println(n);
            return;
        }

        System.out.println(n);
//        same fxn called again
        print(n + 1);

    }
}