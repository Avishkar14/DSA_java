import java.util.ArrayList;

public class RecArr_FindTarget_inArr {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 8, 8, 15, 2};
//        System.out.println(search2(arr, 2, 0));
//        System.out.println(findAllIndex( arr, 8, 0, new ArrayList<>() ));
        System.out.println(findAllIndex2(arr, 8 , 0));
    }

    static int search(int[] arr, int target , int index ){
        if( index == arr.length  ){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        else{
            return search(arr, target, index+1);
        }

    }

    static boolean search2( int[] arr, int target , int index){
        if( index == arr.length){
            return false;
        }
        return arr[index] == target || search2(arr, target, index+1);
    }
    //Good Q : Concepts clear of what to return in recursion, Arraylist return
    static ArrayList<Integer> findAllIndex(int[] arr, int target , int index , ArrayList<Integer> list){
        if( index == arr.length){
            return list;
        }
        if( arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target , index+1 , list);
    }

    //Not good at optimization , takes extra space but good for clearing concepts.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if( index == arr.length){
            return list;
        }
        //it contains ans for that function call only
        if( arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target , index+1 );
        //using addAll method;
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
