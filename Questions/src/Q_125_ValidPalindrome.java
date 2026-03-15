class Q_125_ValidPalindrome {
//psvm
    public static boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        if(s.isEmpty()){
            return true;
        }
       
        s = s.replaceAll("[^a-z0-9]", "");
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
