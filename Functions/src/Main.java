import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        name();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your class   :");
        String cl=in.next();
        System.out.println("Enter your age :");
        int age=in.nextInt();
        class_age(cl , age);
       // String ans= class_age("12A",17);
       // System.out.println(class_age);
    }

    //creating function : name();
    static void name(){
        System.out.println("Enter your name :");
        Scanner in=new Scanner(System.in);

        String a=in.nextLine();
        System.out.println("Hello ,"+ a);

    }

    static void class_age(String cl , int age){

        System.out.println("Class:"+cl+"\n Age:"+age);

    }
}