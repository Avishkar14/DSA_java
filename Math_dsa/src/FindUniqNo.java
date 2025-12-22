public class FindUniqNo {
    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 , 2, 1, 3};
        System.out.println(isUniq(arr));
    }

    private static int isUniq(int[] arr) {
        int unique = 0;
// Below is advanced FOR loop:
// It means int n = element of arr interates each loop and unique = unique XOR n;

        for( int n: arr){           // for( int i = 0; i < arr.length; n++){
            unique ^= n;            //      unique = unique ^ arr[i] ;     }
        }
        return unique;
    }
}
