import java.util.Scanner;

public class Num_occ {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter a digit to find occurrences :");
        int d=sc.nextInt();

        int count=0;

        while (num>0){
            int rem=num%10;

            if (rem==d){
                count++;
            }
            num=num/10;
        }

        System.out.println("number of occurrences are : "+ count);


    }
}
