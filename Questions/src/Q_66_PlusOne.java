import java.util.Arrays;

public class Q_66_PlusOne {
    public static void main(String[] args) {
        int[] digits = { 9,8,7,6,5,4,3,2,1,0 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
//        public static int[] plusOne(int[] digits) {
//            if( digits[digits.length-1] != 9 ){
//                digits[digits.length-1] ++;
//            }
//            else if( digits[digits.length-1] == 9 ){
//                int[] new_digits = new int[digits.length + 1];
//                for(int i = 0; i < digits.length ; i++){
//                    new_digits[i] = digits[i];
//                }
//                new_digits[digits.length-1] = 1;
//                new_digits[digits.length] = 0;
//                return new_digits;
//            }
//            // else{
//            //     // digit = 0;
//            //     digit
//            // }
//            return digits;
//        }

    public static int[] plusOne(int[] digits){
        int i = digits.length - 1;
        long sum = 0;
        int raise_to = 0;
        int carry = 0;
        if (digits.length > 18) {
            int j = digits.length - 1;
            while (j >= 0) {
                if (digits[j] == 9) {
                    digits[j] = 0;
                    j--;
                } else {
                    digits[j]++;
                    return digits; // done
                }
            }
            // if we finished loop, it means all were 9s → need extra digit
            int[] answer = new int[digits.length + 1];
            answer[0] = 1;
            return answer;
        }
        while( i >= 0 ){
            sum += power( digits[i] , raise_to);
            i--;
            raise_to++;
        }
        sum++;

        if (sum % 10 == 0) {
            int flag = 0;
            //this for loop is to calc length of ans arr
            for(int k = 0 ; k < digits.length ; k++){
                if( digits[k] == 9){
                    flag++;
                }
                if( flag == digits.length){
                    carry++;
                }
            }
            int[] answer = new int[digits.length + carry]; // +1 for carry
            for (int j = answer.length - 1; j >= 0; j--) {
                answer[j] = (int)(sum % 10);
                sum /= 10;
            }
            return answer;
        }

        for( int j = digits.length - 1; j >= 0; j-- ){
            digits[j] = (int)(sum % 10);
            sum = sum / 10;
        }
        return digits;
    }

    public static long power( int num, int raise_to){
        long ans = 1;
//            if( raise_to == 0){
//                ans = num;
//            }
        for( int i = 0; i < raise_to  ; i++){
            ans *= 10;
        }

        return ans*num;
    }

}
