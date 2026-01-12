class Q_1720_Decode_XOR_arr {
    //psvm
    public static int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        for(int i = 0; i <= encoded.length; i++ ){
            if( i == 0){
                ans[i] = first;
            }
            else{
                ans[i] = ans[i-1] ^ encoded[i-1];
            }
        }
        return ans;
    }
}
