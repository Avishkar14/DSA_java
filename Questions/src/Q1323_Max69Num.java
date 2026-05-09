import java.util.List;
import java.util.ArrayList;
class Q1323_Max69Num {
    public static int maximum69Number (int num) {
        List<Integer> digits = new ArrayList<>();
        int max = 0;
        while( num > 0 ){
            int rem = num%10;
            digits.add(rem);
            num /= 10;
        }

        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits.get(i) == 6) {
                digits.set(i, 9);
                break;
            }
        }

        int pow = 1;

        for (int i = 0; i < digits.size(); i++) {
            max += digits.get(i) * pow;
            pow *= 10;
        }

        return max;
    }
}
