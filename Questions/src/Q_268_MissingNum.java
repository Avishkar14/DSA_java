public class Q_268_MissingNum {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
//        int i = 0;
        System.out.println(Cyclic(arr));

    }

//    My initial way
    public static int missingNumber(int[] nums) {
        int i = 0;
        int count = 0;
        while( i != nums.length ){
            if( i == nums[i] ){
                count = 0;
                i++;
            }
            else{
                if(nums[i] == nums.length){
                    i++;
                }
                else{
                    int temp = nums[i];
                    nums[i] = nums[temp ];
                    nums[temp] = temp;
                    count++;
                }
            }
            if( count > nums.length){
                return i;
            }

        }

        for(int j = 0; j < nums.length ; j++){
            if( j != nums[j] ){
                return j;
            }
            else{
                count = nums.length;
            }
        }
        return count;
    }
//Kunal's Way much better
    public static int Cyclic(int[] nums){
        int i = 0;
        while( i != nums.length ){
//            for nums[i] the index i is equal to nums[i] - 1 then i++
            if( i == nums[i] || nums[i] == nums.length ){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if( nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
}
