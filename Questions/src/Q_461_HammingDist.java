class Q_461_HammingDist {
    public static int hammingDistance(int x, int y) {
        int ans = x^y;
        int count = 0;
        //convert ans to binary :
        // int bin = 0;
        // int pow = 1;
        // while( ans > 0 ){
        //     int digit = ans%2;
        //     bin += digit*pow;
        //     pow *= 10;
        //     ans /= 2;
        // }

        // while( bin > 0){
        //     int rem = bin%10;
        //     if( rem == 1){
        //         count++;
        //     }
        //     bin /= 10;
        // }

        while( ans > 0){
            int rem = ans%2;
            if( rem == 1){
                count++;
            }
            ans /= 2;
        }

        return count;
    }
}
