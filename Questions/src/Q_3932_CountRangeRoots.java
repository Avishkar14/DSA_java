import java.lang.Math;
class Q_3932_CountRangeRoots {
    public static int countKthRoots(int l, int r, int k) {
        int count = 0;
        // List<Integer> roots = new ArrayList<>();
        int i = 0;

        if( k == 1 ){
            return Math.abs( l - r) + 1;
        }

        while(Math.pow(i , k) <= r ){
            // roots.add( (int)Math.pow( i , k) );
            if( l <= Math.pow(i,k) && Math.pow(i , k) <= r  ){
                count++;
            }
            
            i++;
        }
        return count;
    }
}
