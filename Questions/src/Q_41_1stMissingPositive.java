class Q_41_1stMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,19};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int ans = 0;
        while( i != nums.length ){
            
            if( nums[i] == i+1 ){
                i++;
            }
            else{
                //swapping at correct place which is element -1 == index;
                if(nums[i] > 0  && nums[i] <= nums.length - 1){
                    if( nums[i] == i+1 || nums[i] == nums[nums[i] - 1]){
                        i++;
                    }
                    else{
                        //swapping at correct place which is element -1 == index;
                        int temp = nums[i];
                        nums[i] = nums[temp - 1];
                        nums[temp - 1] = temp;
                    }
                }
                else{
                    i++;
                }
                
            }
        }

        for(int j = 0; j < nums.length ; j++){
            if(nums[j] != j+1){
                ans = j+1;
                break;
            }
            else{
                ans = j + 2;
            }
        }
        return ans;
    }
}