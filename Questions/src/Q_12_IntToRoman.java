class Q_12_IntToRoman {
    public static String intToRoman(int num) {
        
        char[] sym = {'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[]  val = { 1 ,  5 ,  10,  50, 100, 500, 1000};
        int pow = 1;
        String ans = "";

        while(num > 0){
            
            int digit = num % 10;
            int whole = digit*pow;    // to get whole no like 9 , 70 , 300 
            
            //spl case - used subs
            if( (digit == 4) || (digit == 9) ){
                ans = romanSubs(whole, sym, val) + ans;
            }
            else{
                ans = findRoman(whole, sym, val) + ans;
            }

            pow *= 10;
            num /= 10;
        }

        return ans;
    }

    //method to find normal added roman no.
    public String findRoman(int n, char[] sym, int[] val){
        int i = val.length - 1;
        String roman = "";
        while( n > 0){
            if( n >= val[i] ){
                n -= val[i];
                roman = roman + "" + sym[i];
            }
            else{
                i--;
            }
        }

        return roman;
    }

    public String romanSubs(int n, char[] sym, int[] val){
        String roman = "";
        int j = 0;
        
        while( val[j] < n ){
            ++j;
        }

        roman = "" + sym[j];
        int remain = val[j] - n;
        n = remain;
        j = val.length - 1;
        
        while( n > 0 ){
            if( n == val[j] ){
                n = 0;
                roman = sym[j] + roman;
            }
            j--;
        }

        return roman;
    }
}
