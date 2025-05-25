public class shadowing {
    static int a=10;

    public static void main(String[] args) {
        System.out.println(a);              //here a=10
        int a=20;                              //local scope (only valid in main())
        System.out.println(a);              //we shadowed/overwrote a=10 as a=20;
        abc();
    }

    static void abc(){

        System.out.println(a); //here again a=10 as the method is in the scope of static int a=10;
    }
}
