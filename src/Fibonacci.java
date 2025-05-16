import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter elements you want in series :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0;
        int b=1;

        System.out.println("fibonacci series :");

        for (int i=0; i<n ; i++) {
            int c = a + b;
            a=b;
            b=c;
            System.out.println(" "+c +" ");
        }
    }
}
