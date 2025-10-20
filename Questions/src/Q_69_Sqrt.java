<<<<<<< Updated upstream
public class Q_69_Sqrt {
    public static void main(String[] args) {
        int x = 2147395600;
        System.out.println(sqrt(x));
    }
    public static int sqrt(int x){
        if(x < 2){
            return x;
        }

        int start = 1;
        int end = x/2;
        int ans = 0;
         while( start <= end ){
             int mid = start + ( end - start )/2;
             if( (long)mid*mid <= x ){
                 ans = mid;
                 start = mid + 1;
             }
             else{
                 end = mid - 1;
             }
         }
         return ans;
    }
}
=======
public class Q_69_Sqrt {
    public static void main(String[] args) {
        int x = 2147395600;
        System.out.println(sqrt(x));
    }
    public static int sqrt(int x){
        if(x < 2){
            return x;
        }

        int start = 1;
        int end = x/2;
        int ans = 0;
         while( start <= end ){
             int mid = start + ( end - start )/2;
             if( (long)mid*mid <= x ){
                 ans = mid;
                 start = mid + 1;
             }
             else{
                 end = mid - 1;
             }
         }
         return ans;
    }
}
>>>>>>> Stashed changes
