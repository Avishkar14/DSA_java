import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();

        if (num%2==0){
            System.out.println("Number is even ." + num );
        }
        else {
            System.out.println("Number is odd. " + num);
        }


    }
}
