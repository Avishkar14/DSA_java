import java.util.Scanner;

public class Armstrong_Num {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(Arm(x));
    }

    static boolean Arm(int n){
        int sum=0;
        int original=n; //stores original value to be used later for comparing.
       while( n > 0 ){
           int rem= n % 10 ;
           sum=  sum + rem*rem*rem ;
           n = n / 10;
           }
       return sum == original ;
       }

    }
