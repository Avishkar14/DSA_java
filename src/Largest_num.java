import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        System.out.println("enter 1st number : ");
        Scanner in= new Scanner(System.in);
        int a=(int)(in.nextInt());

        System.out.println("enter 2nd number : ");
        int b=in.nextInt();

        if (a>b){
            System.out.println("Largest number is : "+ a);
        }
        else if (b>a ){
            System.out.println("Largest number is : "+ b );
        }
        else if (a==b){
            System.out.println("Both are same number" );
        }
        else {
            System.out.println("Enter correct input");
        }

    }
}
