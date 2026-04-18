class Q_3783_MirrorDist {
    public static void main(String[] args) {
        System.out.println(mirrorDistance(111));
    }
    public static int mirrorDistance(int n) {
        if( n < 10){
            return 0;
        }
        return Math.abs(n - reverse(n));
    }

    public static int reverse(int n){
        int rev = 0;
        int pow = 1;
        while(n > 0){
            int digit = n % 10;
            rev = rev*pow + digit;
            pow = 10;
            n /= 10;
        }
        return rev;
    }
}