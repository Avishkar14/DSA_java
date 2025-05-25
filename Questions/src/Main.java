import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //program to count 1 to 100 natural no.
        //brute force approach :
 /*
        int sum=0;

        for (int i=1; i<=100; i++) {
            sum += i;
        }

        System.out.println("total :"+sum);
*/

        //optimising code ;
        System.out.println("enter a number till which to calculate sum of natural numbers : ");
        Scanner in=new Scanner(System.in);
        int sum=0;
        //int n=100;
        int n=in.nextInt();
        int div=n/2;    //100/2=50
        int rem=n%2;    //100%2=0
        int total=n*(div+rem);
        if(rem==0){
            rem=div;
            total=total+rem;
        }
        System.out.println("total :"+total);
    }
}