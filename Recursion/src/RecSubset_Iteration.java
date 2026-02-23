import java.util.ArrayList;
import java.util.List;

public class RecSubset_Iteration {
    public static void main(String[] args) {
        int[]  arr = { 1, 2, 2};
        List<List<Integer>> ans = Subs_Dupli_elem(arr);
        for ( List<Integer> list: ans){
            System.out.println(list);
        }

    }

    static List<List<Integer>> subset( int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); //Initially we added empty arraylist.

        for( int num: arr){
            int n =  outer.size(); // take this variable else loop runs forever as we update outer continuously.
            for( int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); //outer.get(i) to access like :       0th   1st
                //                                                                                             |    |
                //                                                                                             v    v
                internal.add(num); // We are adding the num = arr[] to the all lists of prev ans like [] -> [ [] , [1] ] is prev list
                // and num = 2, Now we add 2 to each list(internal) that is --> internal.add(num);
                outer.add(internal);
            }

        }
        return outer;
    }
// When duplicate elements exits in array and solved using iteration:
    static List<List<Integer>> Subs_Dupli_elem( int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); //Initially we added empty arraylist.
        int start = 0;
        int end = 0;
        for( int i = 0; i < arr.length; i++){
            start = 0;
            //Duplicate detected
            if( i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for( int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }

        }
        return outer;
    }


}
