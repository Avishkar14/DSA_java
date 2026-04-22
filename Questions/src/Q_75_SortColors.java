import java.util.Arrays;

class Q_75_SortColors {
    public static void main(String[] args) {
        int[] nums = { 0,2,2,2,0,2,1,1};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        //to find most right no which is not equal to 2 to keep track to replace:
        for(; right >= 0; right--){
            if( nums[right] != 2){
                break;
            }
        }
        //same for 0 :
        for(; left < nums.length; left++){
            if( nums[left] != 0){
                break;
            }
        }

        int i = 0;
        while(i < nums.length){
            if(nums[i] == 2 && right > i){
                if( ( right >= 0) && (nums[right] != 2)  ){
//                    do{
//                        right--;
//                    }while( right >= 0 && nums[right] == 2 );
                    swap(nums, i , right );
                }
                right--;
            }
            //now for 0 and left
            else if(nums[i] == 0 && left <= i){
                if(( left < nums.length) && (nums[left] != 0)   ){
//                    do{
//                        left++;
//                    }while( left < nums.length && nums[left] == 0 );

                    swap(nums, i , left );


                }
                left++;
                i++;
            }
            else{
                //detected 1
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int[] swap(int[] nums, int a , int b ){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

        return nums;
    }
}