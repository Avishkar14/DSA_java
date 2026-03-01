class Q_58_LengthOfLastWord {
    //psvm
  //this is faster;
    public static int lengthOfLastWord(String s) {
        // String ans = "";
        s = s.trim();  
        int count=0;
        int i = s.length()-1; 
        while( i >= 0 && s.charAt(i) != ' ' ){
            // ans += s.charAt(i);
            count++;
            i--;
        }
        
        // return ans.length();
        return count;
    }
  //this is slow and more memory req;
  public static int lengthOfLastWord2(String s) {
        String ans = "";
        s = s.trim();  
        int i = s.length()-1; 
        while( i >= 0 && s.charAt(i) != ' ' ){
            ans += s.charAt(i);
            i--;
        }
        
        return ans.length();
    }
}
