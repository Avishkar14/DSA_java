
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Q_989_AddToArr {
    public static void main(String[] args) {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        System.out.println(addToArrayForm(num, 1));
    }
//
//    public static List<Integer> addToArrayForm(int[] num, int k) {
//        long sum = 0;
//        long pow = 1;    //initially pow is 1
//        // for(int i = 0; i < num.length ; i++){
//
//        //     sum += num[i] * (10 ** (num.length - i - 1));
//
//        // }
//        for (int i = num.length - 1; i >= 0; i--) {
//
//            sum += num[i] * pow;
//            pow = pow * 10;
//        }
//        sum += k;
//
//        int ansLength = 0;
//        // pow = 1;
//        for (int i = num.length; i < num.length * 5; i++) {
//            if (sum / (pow / 10) < 10) {
//                ansLength = i;
//                break;
//            }
//            pow = pow * 10;
//        }
//
////        List<Long> ans = new ArrayList<Long>();
//        List<Integer> Out = new ArrayList<>();
//        for (int i = 0; i < ansLength; i++) {
////            ans.add(sum % 10) ;
////            Out.add(ans.get(i).intValue());
////            sum = sum/10;
//            Out.add((int) (sum % 10));  // Get the rightmost digit and cast to int
//            sum /= 10;
//        }
//        Collections.reverse(Out);
//        // ans.add(sum);
//        return Out;
//
//    }
    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> k_arr = new ArrayList<>();
        while( k != 0){
            k_arr.add(k%10);
            k = k/10;
        }

        int max_length = num.length;
        int min_length = k_arr.size();
        if( k_arr.size() > num.length ){
            max_length = k_arr.size();
            min_length = num.length;
        }

        int i = 0;
        int carry = 0;
        while( i < max_length ){

            int sum = 0;
            if( i < min_length){
                int curr_digit = 0;
                if( num.length == 1){
                    curr_digit = num[0];
                }
                else{
                    curr_digit = num[num.length - i - 1];
                }
                sum = curr_digit + k_arr.get(i) + carry;
                carry = 0;
                if( sum > 9){
                    //need a carry
                    sum = sum%10;
                    k_arr.set(i,sum);
                    sum = 0;
                    carry = 1;
                }
                else{
                    k_arr.set(i,sum);
                }
            }
            else if( min_length == num.length){

                sum = k_arr.get(i) + carry;
                carry = 0;
                if( sum > 9){
                    //need a carry
                    sum = sum%10;
                    k_arr.set(i,sum);
                    //                        k_arr.add(sum);
                    sum = 0;
                    carry = 1;
                }
                else{
                    k_arr.set(i,sum);
                    //                        k_arr.add(sum);
                }

            }
            else {    //else if( min_length <= k_arr.size() )
                sum = num[num.length - i - 1] + carry;
                carry = 0;
                if( sum > 9){
                    //need a carry
                    sum = sum%10;
    //                    k_arr.set(i,sum);
                    k_arr.add(sum);
                    sum = 0;
                    carry = 1;
                }
                else{
    //                    k_arr.set(i,sum);
                    k_arr.add(sum);
                }

            }

            i++;

        }

        if( carry == 1){
            k_arr.add(carry);
            carry = 0;
        }
        Collections.reverse(k_arr);
        return k_arr;

    }
}