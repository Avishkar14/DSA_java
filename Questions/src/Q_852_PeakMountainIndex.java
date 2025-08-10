public class Q_852_PeakMountainIndex {
    public static void main(String[] args) {
        int[] arr={24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end = arr.length-1;
        int ans=0;
        while(start <= end){
            int mid = start + (end - start)/2;
            //assume mid is max;
            // int max = mid;

            if( arr[mid] < arr[mid + 1]){
                //search on right side
                start = (mid+1);
            }
            else if(  arr[mid] < arr[mid - 1]){
                //search on left side

                end = (mid-1);
            }
            else{   //this block is not required as we can turn else if to else
                    // and return start out of this loop
                    // here all three s,e,m points to max so we can return any of them

                return mid;
            }
//            start++;
            ans=mid;    //not necessary to use ans all 3(s,e,m)points to max so
                        // we can return any of them
        }
        return ans;
    }
}
