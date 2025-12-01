import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Q_989_AddToArr {
    public static void main(String[] args) {
        int[] num = { 9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(num,1));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long sum = 0;
        long pow = 1;    //initially pow is 1
        // for(int i = 0; i < num.length ; i++){

        //     sum += num[i] * (10 ** (num.length - i - 1));

        // }
        for( int i = num.length - 1; i >= 0; i--){

            sum += num[i]*pow;
            pow = pow * 10;
        }
        sum += k;

        int ansLength = 0;
        // pow = 1;
        for( int i = num.length; i < num.length*5; i++){
            if( sum / (pow/10) < 10){
                ansLength = i;
                break;
            }
            pow = pow * 10;
        }

//        List<Long> ans = new ArrayList<Long>();
        List<Integer> Out = new ArrayList<>();
        for(int i = 0; i < ansLength ; i++){
//            ans.add(sum % 10) ;
//            Out.add(ans.get(i).intValue());
//            sum = sum/10;
            Out.add((int) (sum % 10));  // Get the rightmost digit and cast to int
            sum /= 10;
        }
        Collections.reverse(Out);
        // ans.add(sum);
        return Out;

    }
}