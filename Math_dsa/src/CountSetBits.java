public class CountSetBits {
    public static void main(String[] args) {

        int n = 10; //Binary = 1010 So, ans expected is 2 as 2 times 1 occurs
//        System.out.println(Integer.toBinaryString(n));
        System.out.println(set_Bits(n));
    }

    private static int set_Bits(int n) {
        int count = 0;
        //Both ways works
//        while( n > 0){
//            count ++;
//            n -= n & -n;
//        }

        while( n > 0){
            count ++;
            n = n & (n-1);

        }
        return count;
    }
}
