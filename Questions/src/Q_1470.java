import java.util.Arrays;

//1470. Shuffle the Array
public class Q_1470 {
    public static void main(String[] args) {
        int[] nums={ 1, 2, 3, 4, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(shuffle(nums , 4)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0 ; i<nums.length ; i++){
            //0 or even
            if(i==0 || i%2==0){
                arr[i]=nums[j];
            }
            //odd
            else {
                    arr[i]=nums[j+n];
                    j++;

            }
        }
        return arr;
    }
}