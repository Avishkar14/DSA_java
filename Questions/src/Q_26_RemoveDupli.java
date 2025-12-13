import java.util.Arrays;

class Q_26_RemoveDupli {
    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
        System.out.println((removeDuplicates(nums)));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int prev = 0;
        //unique elements counting code:
        for(int i=0; i<nums.length; i++ ){
            if( i==0 ){

                prev = nums[i];
                count++;
            }
            else{
                if( nums[i] != prev ){

                    prev = nums[i];
                    //swap
                    int temp = nums[count];
                    nums[count] = nums[i];
                    nums[i] = temp;
                    count++;
                }

            }
        }
        return count;
    }
}