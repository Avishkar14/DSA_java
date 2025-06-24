public class Main{
    public static void main(String[] args) {
        int[] arr={12,32,44,2,10,-4, 6,9 };
        int req_element=10;
        int ans=linearsearch( req_element , arr);
        System.out.println(ans);

    }
    static int linearsearch( int req_element , int[] arr){

        if (arr.length==0){
            return -1;
        }
        for (int i=0; i<arr.length; i++){
        int curr_element=arr[i];
            if(curr_element==req_element){
                return i;
            }
        }

        return -1;
    }
}