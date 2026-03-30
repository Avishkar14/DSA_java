class Q_709_ToLowerCase {
    public static String toLowerCase(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( ( (int)(ch) < 91) && ( 64 < (int)(ch) ) ){
                ch = (char)(s.charAt(i) + 32);
                ans += ch;
            }
            else{
                ans += ch;
            }
        }
        return ans;
    }
}
