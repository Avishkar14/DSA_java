import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        isPrime(a);

    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {

            if (n % c == 0) {
                System.out.println("num is not prime. ");
                return false;
            }
//            else {
//                System.out.println("Number is prime.");
//            }
            c++;

        } System.out.println("Number is prime.");

        return false;
    }
}
