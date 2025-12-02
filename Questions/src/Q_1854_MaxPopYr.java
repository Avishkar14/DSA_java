public class Q_1854_MaxPopYr {
    public static void main(String[] args) {
        int[][] logs = {{2025,2041},{1988,2007},{2003,2046},{2045,2049},{2025,2027},{2014,2040},{2014,2027},{2011,2027},{1972,2019}};
//        int[][] logs = {{ 1950,1961},{1960,1971}, {1970,1981} };
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int r = 0;
        // int start = logs[r][0];
        // int end = logs[r][1];
        int max_count = 0;  //for max pop count

        int max_pop_yr = logs[r][0];    //yr with max pop assume for start r=0

        for(int i = 0; i < logs.length  ; i++ ){
            int pop = 1;        //for curr pop count
            for(int j = 0; j < logs.length ; j++){

                int start = logs[i][0];
                int end = logs[i][1] - 1;
                int curr_start = logs[j][0];
                int curr_end = logs[j][1] - 1;

                if( (curr_start <= end && ( curr_start >= start  )) || (curr_end <= end && ( curr_end >= start  )) ) {
                    if( i != j ){
                    pop++;
                }}
                if( pop > max_count ){
                    max_count = pop;
                    max_pop_yr = start;
                }
            }
//            pop = 0;
        }
        return max_pop_yr;
    }

}
