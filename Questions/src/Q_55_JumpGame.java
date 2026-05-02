class Q_55_JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[] { 2 , 3, 1, 1, 4}));
    }
    public static boolean canJump(int[] nums) {
        int[] visit = new int[nums.length];
        for( int i= 0; i < nums.length; i++){
            visit[i] = -1;
        }
        return isReacheable( nums, 0, nums[0], visit );
    }

    public static boolean isReacheable( int[] nums, int i, int jump , int[] visit){
        //base condn:
        if( i >= nums.length - 1 ){
            visit[nums.length - 1] = 1;
            return true;
        }
        // if( jump == 0  ){//|| nums[i + jump] == 0
        //     // visit[i] = 0;
        //     return false;
        // }
        if( visit[i] == 1 ){
            return true;
        }
        else if( visit[i] == 0){
            return false;
        }
        // else{
        //accept:
        // i += jump;

        // jump = nums[i];
        // }
        if( jump + i >= nums.length - 1 ){
            visit[i] = 1;
            return true;
        }
        //Or i reaches previous index same: then false
        boolean ans = false;
        for( int j = jump; j > 0; j--){
            if( i+j < nums.length){
                ans = isReacheable( nums, i + j, nums[i+ j] , visit );
                if(ans){
                    visit[i] = 1;
                    return ans;
                }
            }

        }
        if( ans == false){
            visit[i] = 0;
        }
        return ans;
    }
}