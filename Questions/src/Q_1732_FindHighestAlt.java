public class Q_1732_FindHighestAlt {
    public static void main(String[] args) {
        int[] gain = { -5 , 1, 5, -3, 5};
        System.out.println(largestAltitude(gain));
    }
        public static int largestAltitude(int[] gain) {
            int alt = 0;
            int max = 0;
            for( int i = 0 ; i < gain.length ; i++){
                alt += gain[i];
                if ( alt >= max ){
                    max = alt;
                }
            }
            return max;
        }

}
