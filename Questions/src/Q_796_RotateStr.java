class Q_796_RotateStr {
    public static void main(String[] args) {
        System.out.println(rotateString("defdefdefabcabc", "defdefabcabcdef"));
    }
    public static boolean rotateString(String s, String goal) {
        int i = 0;
        int j = 0;

        if( s.length() != goal.length()){
            return false;
        }
        while( j < s.length() ){
            //i == fix and j % length
            if( s.charAt(i) == goal.charAt(j) ){
                if(isValid(i , j , s, goal)){
                    return true;
                }
            }
            // else{
            j++;
            // j = j % s.length();
            // }
        }

        return false;
    }

    static boolean isValid( int i , int j , String s, String goal){
        for(; i < s.length(); i++ ){
            if( s.charAt(i) != goal.charAt(j) ){
                return false;
            }
            j++;
            j = j % s.length();
        }
        return true;
    }

}