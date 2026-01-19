public class RecSubset_SkipStrAndNotSkip {
    //Here we skip string like App but not skip if its Apple.
    public static void main(String[] args) {
        System.out.println(skip( "abcAppleApAppde", "App", "Apple"));
    }

    static String skip( String up, String toSkip, String toNotSkip ){
        if( up.isEmpty()){
            return "";
        }

        if( up.startsWith(toSkip) && !up.startsWith(toNotSkip)){
            return skip(up.substring(toSkip.length()), toSkip, toNotSkip);
        }
        else{
            return up.charAt(0) + skip(up.substring(1) , toSkip, toNotSkip);
        }
    }

}
