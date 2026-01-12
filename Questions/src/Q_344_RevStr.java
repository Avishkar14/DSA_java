class Q_344_RevStr {
    //psvm
    public static void reverseString1(char[] s) {
        //using recursion ? 
        helper( s, 0);
    }

    void helper( char[] s, int index){

        if( index == (s.length +1)/2){
            return;
        }
        //swap
        char temp = s[index];
        s[index] = s[ s.length - 1 - index];
        s[ s.length - 1 - index] = temp;
        helper( s, index+1);
    }
  //using iterative method:
    public static void reverseString2(char[] s) {
        for( int i = 0; i < (s.length + 1)/2; i++){
            //swap
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1- i] = temp;
        }
        return;
    }

}

