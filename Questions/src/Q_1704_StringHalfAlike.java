class Q_1704_StringHalfAlike {
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();

        int a = 0;
        int b = 0;

        for(int i = 0; i < s.length(); i++){
            if( i < s.length()/2 ){
                if( (s.charAt(i) == 'a') ||  (s.charAt(i) == 'e') ||  (s.charAt(i) == 'i') ||  (s.charAt(i) == 'o') ||  (s.charAt(i) == 'u') ){
                    a++;
                }
            }
            else{
                if( (s.charAt(i) == 'a') ||  (s.charAt(i) == 'e') ||  (s.charAt(i) == 'i') ||  (s.charAt(i) == 'o') ||  (s.charAt(i) == 'u') ){
                    b++;
                }
            }
        }

        if( a == b){
            return true;
        }

        return false;
    }
}
