import java.util.Arrays;

class Q_27_RemoveElem {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,2,3,0,4,2 };
        System.out.println(Arrays.toString(removeElement(nums,2)));
    }
    public static int[] removeElement(int[] nums, int val) {
        int count = 0;
        for( int i = 0; i < nums.length; i++){
            if( val == nums[i] ){
                count++;
            }
        }
        // now swap from ending but skip if val = nums;
        for( int i = 0; i < nums.length-count; i++){
            if( nums[i] == val ){
                //swap with last not equal elem.

                for( int j =  i ; j< nums.length; j++){
                    if( val != nums[j] ){
                        //swap
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
//        return nums.length-count;
        return nums;
    }
}