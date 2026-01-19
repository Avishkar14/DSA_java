class Q_1837_SumOfDigiBaseK {
    public static int sumBase(int n, int k) {
        int ans;
        // int rem = 0;
        List<Integer> rem = new ArrayList<>();
        while( n != 0){
            ans = 0;
            ans = n / k;
            rem.add(n % k);
            n = ans;
        }
        ans = 0;
        for( int i = 0 ; i < rem.size(); i++){
            ans += rem.get(i); 
        }
        return ans;
    }
}
