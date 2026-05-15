import java.util.List;
import java.util.ArrayList;
class Q_728_SelfDivideNo {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for( int i = left ; i <= right; i++ ){
            if( isValid(i) ){
                ans.add(i);
            }
        }

        return ans;
    }

    public static boolean isValid( int i ){
        int num = i;

        while( i > 0 ){
            int rem = i % 10;
            if( rem == 0 || num%rem != 0 ){
                return false;
            }
            i /= 10;
        }

        return true;
    }
}
