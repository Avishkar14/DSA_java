class Q_238_ProdOfArr {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        int countZeroes = 0;
        
        //calc total product:
        for(int i = 0; i < n; i++){
            prod *= nums[i];
            if(nums[i] == 0){
                countZeroes++;
            }
        }

        int prodForOneZero = 1;
        if(countZeroes == 1){
            for(int i = 0; i < n; i++){
                
                if(nums[i] != 0){
                    prodForOneZero *= nums[i];
                }
            }
        }
        
        //put val in ans:
        for(int i = 0; i < n; i++){
            if( countZeroes == 1 ){
                if( nums[i] == 0){
                    ans[i] = prodForOneZero;
                }
            }
            else if( countZeroes > 1){
                break;
            }
            else{
                //W/O 0 condition:
                ans[i] = prod/nums[i];
            }
        }

        return ans;
    }
}
