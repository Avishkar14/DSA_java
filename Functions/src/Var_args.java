import java.util.Arrays;

public class Var_args {
    public static void main(String[] args) {
        abc("a","b","c", "d");
        multi(12 , "Xyz" , 12,3,23,434,21);
        System.out.println();
    }

    static void abc(String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void multi(int x  ,String z, int ...y ){
        System.out.println(x);
        System.out.println(z);
        System.out.println( Arrays.toString(y));

    }
}
