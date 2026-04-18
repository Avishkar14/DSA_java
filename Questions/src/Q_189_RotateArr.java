class Q_189_RotateArr {
    public static void rotate(int[] nums, int k) {
        if( k == nums.length ){
            return;
        }
        
        if( k > nums.length){
            k = k % nums.length;
        }
        int[] ans = new int[nums.length];
        int i = 0;
        while( i < nums.length ){
            ans[i] = nums[Math.abs(nums.length - k + i) % nums.length];
            i++;
        }

        for( int j = 0; j < nums.length; j++){
            nums[j] = ans[j];
        }
        return;
    }
}
