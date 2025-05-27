import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (
public class Int_sum_till_0 {
    public static void main(String[] args) {
        System.out.println("enter a integer and enter '0' to add them :");
        Scanner in= new Scanner(System.in);
        int n;
        int sum=0;
        while(true){
            n=in.nextInt();
            if(n==0){
                break;
            }
           sum=sum+n;
        }

        System.out.println("sum"+sum);
    }
}
