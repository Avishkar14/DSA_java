import java.util.Arrays;

public class PassingViaFxn {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 12};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] array) {
        array[2] = 100;
    }
}