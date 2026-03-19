public class Q_67_AddBin {
    public static void main(String[] args) {
        System.out.println(addBinary( "1011", "111"));
//        System.out.println("0"+(char)48); //works
    }

    public static String addBinary(String a, String b){
        int i = 0;
        int carry = 0;
        String ans = "";
        while( (i < a.length() ) && ( i < b.length()) ){
//char to actual int : - '0' or - 48:
            ans = ((a.charAt(a.length() - 1 - i) - '0') ^ (  b.charAt(b.length() - 1 - i) - '0' ) ^ carry ) + ans;

            if( ( (a.charAt(a.length() - 1 - i) == '1') && ( b.charAt(b.length() - 1 - i) == '1')) || ( (a.charAt(a.length() - 1 - i) == '1') && carry == 1 ) || ((b.charAt(b.length() - 1 - i) == '1') && carry == 1) ) {
                carry = 1;
            }
            else{
                carry = 0;
            }
            i++;

        }

        while( (i < a.length()) || ( i < b.length() )){

            if( i < a.length() ){

                ans = ( (a.charAt(a.length() - 1 - i) - 48) ^ carry ) + ans;

                if( ( a.charAt(a.length() - 1 - i) == '1') && ( carry == 1) ){
                    carry = 1;
                }
                else{
                    // a = 0 and carry = 0 or 1 ; or a = 1 and carry = 0;
                    carry = 0;
                }
            }
            else{
                ans = ((b.charAt(b.length() - 1 - i)- 48) ^ carry ) + ans;

                if( ( b.charAt(b.length() - 1 - i) == '1') && ( carry == 1) ){
                    carry = 1;
                }
                else{
                    // a = 0 and carry = 0 or 1 ; or a = 1 and carry = 0;
                    carry = 0;
                }
            }
            i++;
        }

        if( carry == 1){
            ans = "1"+ans;
            carry = 0;
        }

        return ans;
        // return ""+(a.charAt(0) ^ b.charAt(0));
    }
}
