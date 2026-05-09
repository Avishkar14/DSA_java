class Q_179_LargestNum {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String ans = "";
        int n = nums.length;
        int[] first = new int[n];
        //sort nums based on first digit and if same exists then larger then smaller:
        //But how for case like 3 , 30 ? and 3 , 34 - I guess check for that or next digits:
        //Like in 3 , 30 : as 3 only digi and 30's next is 0 so 0 < 3 therefore - 330:
        //IN 3, 34 : 3 , 34's 4 as 4 > 3 therefore : 343.
        //Sort using bubble ?

        //This loop is for fisrt[]:
        for(int i = 0; i < n; i++ ){
            first[i] = findFirst( nums, nums[i], i );
        }

        //Now sort :
        for( int i = 0; i < n - 1; i++ ){

            for(int j = i + 1; j < n; j++){
                if( first[i] < first[j] ){
                    swap(first , i , j);
                    swap(nums, i , j);
                }
                else if( first[i] == first[j] ){

                    String a = ""+nums[i]+nums[j];
                    String b = ""+nums[j]+nums[i];

                    if (b.compareTo(a) > 0) {
                        swap(nums, i, j);
                        swap(first , i , j);
                    }
                    a = "";
                    b = "";
                }
            }
        }
        //calculate ans:
        for( int i = 0; i < n; i++ ){
            if( nums[0] == 0 ){
                return "0";
            }
            ans += nums[i];
        }
        return ans;
    }

    public static  int findFirst(int[] nums, int nm , int i){
        int first = 0;
        if( nm < 10 ){
            return nm;
        }
        while( nm > 0 ){
            first = nm%10;
            nm /= 10;
        }
        return first;
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}


//OLD FLAWED APPROACH:
//class Solution {
//    public String largestNumber(int[] nums) {
//        String ans = "";
//        int n = nums.length;
//        int[] first = new int[n];
//        //sort nums based on first digit and if same exists then larger then smaller:
//        //But how for case like 3 , 30 ? and 3 , 34 - I guess check for that or next digits:
//        //Like in 3 , 30 : as 3 only digi and 30's next is 0 so 0 < 3 therefore - 330:
//        //IN 3, 34 : 3 , 34's 4 as 4 > 3 therefore : 343.
//        //Sort using bubble ?
//
//        //This loop is for fisrt[]:
//        for(int i = 0; i < n; i++ ){
//            first[i] = findFirst( nums, nums[i], i );
//            // System.out.print(first[i]);
//        }
//
//        // long curr_pow = 0;
//        //store pow of digits needed to multiply to create a number:
//        int[] pow = new int[nums.length];
//        for(int i=0; i< nums.length; i++){
//            pow[i] = findPow(nums[i] , nums);
//        }
//
//        //Now sort :
//        for( int i = 0; i < n - 1; i++ ){
//            // if( i == 0 ){
//            //     // max = nums[i];
//            //     curr_pow = pow[i];
//            // }
//            for(int j = i + 1; j < n; j++){
//                if( first[i] < first[j] ){
//                    swap(first , i , j);
//                    swap(nums, i , j);
//                    swap(pow, i , j);
//                }
//                else if( first[i] == first[j] ){
//                    long pre = 0;//i then j
//                    long post = 0;
//                    pre = nums[i]*pow[j] + nums[j];
//                    post = nums[j]*pow[i] + nums[i];
//                    //arrange accordingly
//                    if( post > pre ){
//                        swap(first , i , j);
//                        swap(nums, i , j);
//                        swap(pow, i , j);
//                    }
//                }
//            }
//        }
//        //calculate ans:
//        for( int i = 0; i < n; i++ ){
//            System.out.print(nums[i]);
//            ans += nums[i];
//        }
//        return ans;
//    }
//
//    public int findFirst(int[] nums, int nm , int i){
//        int first = 0;
//        if( nm < 10 ){
//            return nm;
//        }
//        while( nm > 0 ){
//            first = nm%10;
//            nm /= 10;
//        }
//        return first;
//    }
//
//    public void swap(int[] nums, int a, int b){
//        int temp = nums[a];
//        nums[a] = nums[b];
//        nums[b] = temp;
//    }
//    public int findPow(int num ,int[] nums){
//        long pow = 10;
//
//        if( num < 10 ){
//            return 10;
//        }
//        else{
//            while( num >= 10 ){
//                pow *= 10;
//                num /= 10;
//            }
//        }
//        return pow;
//    }
//}