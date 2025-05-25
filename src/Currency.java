import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter amount (in Rupees) : ");
        Scanner inp=new Scanner(System.in);

        double rupee= inp.nextDouble() ;
        double dollar= rupee*83.5;

        System.out.println("Amount in dollars : " + dollar);

    }
}
