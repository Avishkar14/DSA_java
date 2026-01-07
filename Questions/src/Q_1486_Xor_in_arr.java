class Q_1486_Xor_in_arr {
    //psvm
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        // nums[0] = start;
        int xor = 0;
        for(int i = 0; i < n; i++ ){
            nums[i] = start + 2 * i;
            if( i == 0){
                xor = nums[i];
            }
            else{
                xor ^= nums[i];
            }
        }
        return xor;
    }
}
