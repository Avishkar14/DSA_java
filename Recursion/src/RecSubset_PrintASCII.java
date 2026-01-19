public class RecSubset_PrintASCII {
    //In this code we will print the ASCII value of subsets
    public static void main(String[] args) {
        Return_ASCII( "", "abc");
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
}
