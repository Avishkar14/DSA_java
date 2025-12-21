public class OddOrEvenNo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(isOdd(n));
    }

    public static boolean isOdd(int n){
        return ( n & 1) == 1;// n = no. , & = AND operator ; if  1 , 1 then 1 then true and is odd yes.
    }
}