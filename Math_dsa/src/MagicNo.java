public class MagicNo {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(ans(n));
    }

    private static int ans(int n) {
        int ans = 0;
        int base = 5;
        while( n > 0){
//            n = (n & 1);
            ans += (n & 1)*base;
            base = base*5;
            n = n>>1;
        }
        return ans;
    }
}
