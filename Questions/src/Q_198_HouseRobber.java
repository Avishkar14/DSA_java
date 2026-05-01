class Q_198_HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3,1}));
    }
        public static int rob(int[] nums) {

            int[] store = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                store[i] = -1;
            }
            return find_sum( nums, 0, store);
        }

        public static int find_sum(int[] nums, int i, int[] store){
            //base condition: Quit if i > nums.length
            if( i > nums.length - 1 ){
                // store[i] = sum;
                return 0;
            }
            if( store[i] != -1 ){//&& store[i] > sum
                // sum = store[i];
                return store[i];
            }
            // store[i] += nums[i];
            int incl = find_sum( nums , i + 2 , store) + nums[i];
            int excl = find_sum( nums , i + 1, store);
            store[i] = Math.max( incl, excl);
            return Math.max( incl, excl);
        }

}
//By 2 for loops :
// int sum = 0;
// int max = 0;
// for(int i = 0; i < nums.length; i++){
//     for(int j = 0; j <= i; j++){
//         //initial condition :
//         if( i == 0 && j == 0 ){
//             sum = nums[j];
//         }
//         //to accept : if( Math.abs(i - j) > 1 )

//     }
// }
// return max;