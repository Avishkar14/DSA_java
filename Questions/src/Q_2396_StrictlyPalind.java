import java.util.ArrayList;
import java.util.List;
class Q_2396_StrictlyPalind {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9));
    }
    public static boolean isStrictlyPalindromic(int n) {
        for(int base = 2; base <= n - 2; base++){
            if( !isPalin( n, base)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalin(int n, int base){
        List<Integer> digits = new ArrayList<>();
        //first convert n into base num:
        while( n > 0){
            int rem = n%base;
            n = n/base;
            digits.add(rem);
        }

        //now check for palindrome:
        for( int i = 0; i < digits.size()/2; i++){
            if( digits.get(i) != digits.get( digits.size() - 1 - i)){
                return false;
            }
            
        }
        return true;
    }
}