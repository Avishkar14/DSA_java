class Q_168_ExcelSheetColumn {
    public static String convertToTitle(int columnNumber) {
        String ans = "";
        
        while( columnNumber > 0 ){
            int rem = columnNumber%26;
            char alphabet = (char)(rem + 64);
            if( rem == 0 ){
                alphabet = 'Z';
                columnNumber--;
            }
            ans = alphabet + ans;
            columnNumber /= 26;
        }
        
        return ans;
    }
}
