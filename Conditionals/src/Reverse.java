import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0;
       while( num>0 ) {
            int rem=num%10;
            num=num/10;
            count= count*10+rem;

       }


//       if (int i=count; i>0; i--){
//           num=num%10;

       // }
       System.out.println(count);
    }
}
