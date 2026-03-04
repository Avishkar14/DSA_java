class Q_507_PerfectNum {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(2016));
    }
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i <= num/2 + 1; i++){
            if( sum == num){
                return true;
            }
            else if( sum > num){
                return false;
            }
            if( num % i == 0 ){
                sum += i;
            }
        }

        return false;
    }
}