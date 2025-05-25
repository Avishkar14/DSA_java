import java.util.Scanner;
public class arithmetic_opr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in) ;
        System.out.print("Enter num 1 : ");
        int a=sc.nextInt();

        System.out.print("Enter num 2 : ");
        int b=sc.nextInt();

        System.out.println("Make choice of operation to perform : +, - , * , / .");

        char ch= sc.next().charAt(0);
        int c=0;
        if (ch == '+'){
            c=a+b;

        }
        else if(ch == '-'){
            c=a-b;

        }
        else if (ch== '*'){
            c=a*b;

        }
        else if (ch =='/') {
            if (b != 0) {
                c = a / b;
            } else {
                System.out.println("Enter valid denominator .");
            }
        }
            System.out.println("result : "+c );



    }



}
