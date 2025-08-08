//1512. Number of Good Pairs
public class Q_1512 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for( int i=0; i<nums.length-1; i++){
            for(int j=i; j<nums.length; j++){
                if( (nums[i] == nums[j]) && (i<j) ){
                    count++;
                }
            }
        }
        return count;
    }
}