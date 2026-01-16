class Q_171_ExcelSheetColNo {
    //psvm
    public static int titleToNumber(String columnTitle) {
        int ans = 0;
        // if( columnTitle.length() == 1){
        //     return  (( columnTitle.charAt(0) + 0 ) - 64);
        // }
        //when 2 or more Alphabets :
        for( int i = 0; i < columnTitle.length(); i++){
            ans += Math.pow( 26 , columnTitle.length() -1 - i  )*(( columnTitle.charAt(i) + 0 ) - 64);
        }
        return ans;
    }
}
