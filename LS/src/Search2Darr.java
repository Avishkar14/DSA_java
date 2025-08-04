import java.util.Arrays;

public class Search2Darr {
    public static void main (String[] args){
        int[][] arr={
                {12 , 23 , 2 , 100},
                { 3 , 19 , 21},
                { 10 , 11 , 1 , 90}        };

        int target=11;
       // System.out.println(Search(arr , target));
        int[] ans = Search(arr , target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] Search(int[][] arr , int target){

        for(int row=0 ; row < arr.length ; row++){
            for (int col=0 ; col < arr[row].length ; col++ ){

                if ( arr[row][col] == target ){
                   // System.out.println("element is found");
                    //return target;
                    return new int[] {row , col};

                }
            }
        }
        return new int[] {-1 , -1};

    }
}
