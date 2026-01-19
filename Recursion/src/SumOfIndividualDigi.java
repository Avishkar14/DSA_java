public class SumOfIndividualDigi {
    public static void main(String[] args) {
        System.out.println(sumDigi(1234));
    }
    static int sumDigi(int n){
        if( n == 0){
            return 0;
        }
        return n%10 + sumDigi(n/10);
    }
}
