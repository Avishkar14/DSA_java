public class Q_1342_NumOfSteps_rec {
    public static void main(String[] args) {
        System.out.println(steps(8));
    }
    static int steps(int n){
        return helper(n , 0 );
    }

    static int helper(int n , int count){
        if( n == 0){
            return count;
        }
        if( n%2 == 1){
            //odd
            return helper(n-1, count+1);
        }
        else{
            //even
            return helper(n/2, count+1);
        }
    }
}
