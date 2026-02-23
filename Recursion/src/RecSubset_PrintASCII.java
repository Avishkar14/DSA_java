import java.util.ArrayList;

public class RecSubset_PrintASCII {
    //In this code we will print the ASCII value of subsets
    public static void main(String[] args) {
        Return_ASCII( "", "abc");
        System.out.println(subset_ASCII_AL( "" , "abc"));
    }

    static void Return_ASCII( String p, String up){
        if( up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }

        char ch = up.charAt(0);
        Return_ASCII( p + ch, up.substring(1) );
        Return_ASCII( p , up.substring(1));
        //Just ADDED this " + 0" in (ch + 0) compared to code of Subset :
        Return_ASCII( p + (ch + 0), up.substring(1) );
    }

    static ArrayList<String> subset_ASCII_AL(String p, String up ){
        if( up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subset_ASCII_AL( p + ch , up.substring(1));
        ArrayList<String> right = subset_ASCII_AL( p , up.substring(1));
        ArrayList<String> ascii =  subset_ASCII_AL( p + (ch + 0), up.substring(1) );
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
