public class Main {
    public static void main(String[] args) {
//        pattern2(5);
//        pattern1(5);
//        pattern3(5);
        pattern30(5 );
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + "\t");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
//        int count = 0;
        for (int i = 0; i < n * 2 - 1 ; i++) {
            if( i < n ){
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                //did using extra var named count:
//                    for (int j = i - count - 1; j > 0 + count; j--) {
//                        System.out.print("* ");
//
//                    }
//                    count++;
//                    System.out.println();
                
//                did using formula
                for (int j = 0; j < n - (i%n + 1); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    
    
    static void pattern30(int n){
        for (int row = 1 ; row <= n; row++) {
            int spaces = n - row;
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row*2 - 1; col++) {
                if(col <= row){
                    System.out.print(  " " + (row - col + 1));
                }
                else{
                    System.out.print( " "+ (col - row + 1 ) );
                }

            }
            System.out.println();
        }
    }

    static void pattern31(int n){

        for (int row = 1; row < 2*n; row++) {
            for (int col = 1; col < 2*n; col++) {


            }
        }
    }
}