//This Question uses Cyclic sorting technique
 import java.util.ArrayList;
import java.util.List;

class Q_448_FindAllNumDisappInArr {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,7,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while( i != nums.length ){
//            for arr[i] the index i is equal to arr[i] - 1 then i++

            if( i == nums[i] - 1 ){
                i++;
            }
            else{
                if( nums[i] == nums[nums[i] - 1] ){
                    i++;
                }
                if( i >= nums.length  ){
                    break;
                }
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if( nums[j] != j+1 ){
                ans.add(j+1);
            }
        }
        return ans;
    }
}