import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int ans=0;

        while(true) {
            System.out.println("Enter an operator OR entr 'x' to exit:");
            char op=in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {
                System.out.println("Enter numbers :");
                int a=in.nextInt();
                int b=in.nextInt();

                if(op == '+'){
                    ans=a+b;

                }
                if(op == '-'){
                    ans=a-b;

                }
                if(op == '*'){
                    ans=a*b;

                }
                if(op == '/'){
                    if(b!=0) {
                        ans = a / b;
                    }
                }
                if(op == '%'){
                    ans=a%b;

                }
                System.out.println("answer is :"+ans);

            }
            else if( op == 'X' || op == 'x' ){
                break;
            }
            else{
                System.out.println("invalid input");
            }
        }
    }
}
