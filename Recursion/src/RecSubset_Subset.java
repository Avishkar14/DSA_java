import java.util.ArrayList;

public class RecSubset_Subset {
    public static void main(String[] args) {
        //Using void (as return):
        subset( "", "abc");
        //Using AL<Str> (as return):
        System.out.println(subsetAL( "", "abc"));
    }

    static void subset( String p , String up){
        if( up.isEmpty()){
            System.out.print(p +" ");
            return;
        }

        char ch = up.charAt(0);
        subset( p + ch , up.substring(1));
        subset( p , up.substring(1));
    }
//Using AL<> as type and return it :
    static ArrayList<String> subsetAL( String p, String up ){
        if( up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsetAL( p + ch , up.substring(1));
        ArrayList<String> right = subsetAL( p , up.substring(1));

        left.addAll(right);
        return left;
    }
}
