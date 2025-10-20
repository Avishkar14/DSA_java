class Q_278_FindDupliNo {
    public static void main(String[] args) {
        int[] arr = { 1,3,4,2,2 };
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        int ans = 0;
        while( i != nums.length ){
            
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

        for(int j = 0; j < nums.length ; j++){
            if(nums[j] != j+1){
                ans = nums[j];
            }
        }
        return ans;
    }
}