import java.util.ArrayList;

class Q_9_PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
    public static boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }
        else if( x < 10 ){
            return true;
        }
        //Get number:
        ArrayList<Integer> num = new ArrayList<Integer>();
        if( x % 10 == 0){
            return false;
        }
        while( x > 0 ){
            int rem = x % 10;
            num.add(rem);
            x /= 10;
        }

        for( int i = 0; i < num.size()/2; i++){
            if( num.get(i) != num.get( num.size() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}