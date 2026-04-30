class Q8_StringToInt {
    public static void main(String[] args) {
        System.out.println(myAtoi("   +0 123"));
    }
    public static int myAtoi(String s) {
        long num = 0;
        int pow = 1;
        boolean start = false; //tracks number first occrance
        boolean isNegative = false;
        boolean signed = false;
        int ok = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( ok == 1 && !(ch >= '0' && ch <= '9' ) ){
                break;
            }
            if( ch >= '0' && ch <= '9' ){
                //normal number:
                if( ch == '0' && start == true ){
                    num = num*pow + (int)(ch - '0');
                    pow = 10;
                }
                else if ( ch > '0' ) {
                    start = true;
                    num = num*pow + (int)(ch - '0');
                    pow = 10;
                }
                if( ok == 0 && ch == '0' ){
                    ok = 1;
                }
            }
            else if( ch == ' '){
                if( start == true || signed == true ){
                    break;
                }
                continue;
            }
            else if( signed == false && ch == '+' ){
                signed = true;
                continue;
            }
            else if( ch == '-' && start == false && signed == false){
                isNegative = true;
                signed = true;
            }
            else{
                break;
            }

            if( num > Math.pow( 2 , 31 ) - 1 && isNegative == false){
                return (int)Math.pow( 2 , 31 );
            }
            else if( num > 2147483647 && isNegative == true ){
                return -2147483648;
            }

        }

        if( isNegative ){
            num = -num;
        }
        return (int)num;
    }
}