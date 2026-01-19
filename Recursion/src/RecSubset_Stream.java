public class RecSubset_Stream {
    public static void main(String[] args) {
        //taken 2 str and pass them as i/p for every recursion call:
        skip( "", "afsafg");
        //taken input and recursion call with that i/p only :
        System.out.println(skip( "afsafg"));
    }
    static void skip( String p , String up){
        //             p = processed str, up = unprocessed str;
        if( up.isEmpty() ){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if( ch == 'a'){
            //skip if 'a' occurred
            skip( p , up.substring(1));
        }
        else{
            //include
            skip( p + ch, up.substring(1));
        }
    }

    static String skip( String up){
        if( up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if( ch == 'a' ){
            return skip(up.substring(1));
        }
        else{
            return ch + skip( up.substring(1));
        }
    }
}
