class Q_1848_MinDistToTarget {
    public static int getMinDistance(int[] nums, int target, int start) {
        int curr_min = 99999;
        for(int i = 0; i < nums.length; i++){
            if(( nums[i] == target ) && ( Math.abs( i - start ) < curr_min ) ){
                curr_min = Math.abs( i - start);
            }
            if( curr_min == 0 ){
                return 0;
            }
        }

        return curr_min;
    }
}
