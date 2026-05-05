import java.util.Arrays;

class Q_3919_MinCostToMove {
    public static void main(String[] args) {
        int[] nums = {-5, -2 , 3};
        int[][] queries = {
                {0,2},
                {2,0},
                {1,2}
        };
        System.out.println(Arrays.toString(minCost(nums, queries)));
    }
    public static int[] minCost(int[] nums, int[][] queries) {
        //first calc closest:
        int n = nums.length;
        int[] closest = new int[nums.length];

//fill closest array:
        for(int i = 0; i < n; i++){
            //First and last element conditions:
            if( i == 0 ){
                closest[i] = i+1;
            }
            else if( i == nums.length - 1){
                closest[i] = i - 1;
            }
            //Middle case:
            if( i < n - 1 && 0 < i ){
                if( Math.abs(nums[i] - nums[i - 1]) < Math.abs( nums[i] - nums[i + 1]) || ( Math.abs(nums[i] - nums[i - 1]) == Math.abs( nums[i] - nums[i + 1]) ) ){
                    closest[i] = i - 1;
                }
                else{
                    closest[i] = i + 1;
                }
            }
        }
        System.out.println(Arrays.toString(closest));

//Now queries resolving:
    int[] ans = new int[queries.length];
    int[] forward = new int[n];
    int[] backward = new int[n];

    for(int i = 0; i <= n - 1; i++){
        if( i < closest[i] ){
            //fine
            forward[i] = 1;
        }
        else if ( i == n -1 ) {
            forward[i] = Math.abs( nums[i] - nums[i - 1]);//can also be "0". As doesnt matter as not included in prefix sum calc
        }
        else{
            forward[i] = Math.abs( nums[i] - nums[i + 1]);
        }
    }

    for(int i = n - 1; i >= 0; i--){
        if( i > closest[i] ){
                //fine
            backward[i] = 1;
        } else if ( i == 0 ) {
            backward[i] = Math.abs( nums[i] - nums[i + 1]);//can also be "0". As doesnt matter as not included in prefix sum calc
        }
        else{
            backward[i] = Math.abs( nums[i] - nums[i - 1]);
        }
    }
        System.out.println("For:" + Arrays.toString(forward));
        System.out.println("Back:" + Arrays.toString(backward));
    //Calc sum:
        int[] forwSum = new int[n];
        int[] backSum = new int[n];
//        backSum[0] = backward[0];
//        for( int i = 0; i < n; i++ ){
//            if( i == 0){
//                forwSum[i] = forward[ n - 1];
//                backSum[i] = backward[i];
//            }
//            else{
//                forwSum[i] = forward[ n -1 - i] + forwSum[ i - 1];
//                backSum[i] = backward[i] + backSum[ i -1];
//            }
//        }
        forwSum[0] = 0;

        for(int i = 1; i < n; i++){
            forwSum[i] = forwSum[i - 1] + forward[i - 1];
        }
        backSum[n - 1] = 0;

        for(int i = n - 2; i >= 0; i--){
            backSum[i] = backSum[i + 1] + backward[i + 1];
        }
        System.out.println("Fw Sum:" + Arrays.toString(forwSum));
        System.out.println("Bw Sum:" + Arrays.toString(backSum));

    for(int i = 0; i < queries.length; i++){
        int l = queries[i][0];
        int r = queries[i][1];
        int cost = 0;
        
//        if( l < r ){
//            for(; l < r; l++){
//                if( l < closest[l] ){
//                    cost++;
//                }
//                else{
//                    if( l < n - 1 ){
//                        cost += Math.abs( nums[l] - nums[l + 1]);
//                    }
//
//                }
//                cost += forward[l];
//            }
//        }
//        else{
//            for(; l > r; l--){
//                if( l > closest[l] ){
//                    cost++;
//                }
//                else{
//                    if( l > 0 ){
//                        cost += Math.abs( nums[l] - nums[l - 1]);
//                    }
//                }
//                cost += backward[l];
//            }
//        }
        //Forward
        if( l < r){
            cost = forwSum[r] - forwSum[l];
        }
        else{
            cost = backSum[r] - backSum[l] ;
        }
        ans[i] = cost;
    }

    return ans;

    }
}