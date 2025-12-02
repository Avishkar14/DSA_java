import java.util.Arrays;

class Q_26_Remove_Dupli {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    public static int[] removeDuplicates(int[] nums) {
        int[] copy = new int[nums.length];
        int last_elem = 0;
        int k = 0;  //for count
        int i = 0;
        while(i < nums.length){
            if( i == 0){
                last_elem = nums[i];
                copy[i] = nums[i];
                k++;
                nums[k-1] = copy[i];
                i++;
//                continue;
            }
            else if( last_elem == nums[i] ){
                i++;
//                nums[i] = copy[i];

//                i++;
            }
            else{
                //last_elem != nums[i];
                last_elem = nums[i];
                copy[k] = nums[i];
                k++;
                nums[k-1] = copy[i];
                i++;

            }


        }
        return nums;
    }
}