public class CountZeroes {
    public static void main(String[] args) {
//        count(100);
        System.out.println(count(0));//failed test case of n=0
                                        // should add the total digits count logic ==1 & n == 0 then count+1;
    }
//    static int count = 0;
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n , int count){
        if( n == 0){
            return count;
        }
        int digits = n%10;
        if( digits == 0 ){
            //I did here only & no return : count++;
            return helper(n/10, count+1);
        }
        return helper( n /10, count);
    }
}
