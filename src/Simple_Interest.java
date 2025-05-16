import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        System.out.println("Enter Principal Amount(P) :");
        Scanner in= new Scanner(System.in);
        int p=in.nextInt();

        System.out.println("Enter Rate(R) in percent :");
        int r=in.nextInt();

        System.out.println("Enter Time(T) in years :");
        int t=in.nextInt();

        int si= (p*r*t)/100;

        System.out.println("Simple interest is :" + si);

    }
}
