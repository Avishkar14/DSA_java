public class RecSubset_SkipString {
    public static void main(String[] args) {
//        skip( "", "abcapplede", "apple"); //void skip
        System.out.println(skip( "abcapplecd", "apple"));

    }
    static void skip( String p, String up , String toSkip){
        if( up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if( up.startsWith(toSkip)){
            skip( p , up.substring(toSkip.length()) , toSkip);
        }
        else{
            skip( p + ch, up.substring(1), toSkip);
        }
    }

    static String skip(String up, String toSkip){
        if( up.isEmpty()){
            return "";
        }

        if( up.startsWith(toSkip) ){
            return skip( up.substring(toSkip.length()), toSkip );
        }
        else{
            return up.charAt(0) + skip(up.substring(1), toSkip);
        }
    }
}
