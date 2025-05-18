import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        System.out.println("Enter 1st number:");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        System.out.println("Enter 2nd number :");
        int num2=in.nextInt();
        swap(num1 , num2);
        System.out.println("Swapped numbers :"+num1+" "+num2);
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

    }

    //output not swapped coz of pass by value feature in java
    //to be updated
}
