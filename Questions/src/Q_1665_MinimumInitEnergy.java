import java.util.Arrays;
class Q_1665_MinimumInitEnergy {
    public static int minimumEffort(int[][] tasks) {
        int n = tasks.length;
        // int[] diff = new int[n];

        // for(int i = 0; i < n; i++){
        //     diff[i] = tasks[i][1] - tasks[i][0];
        //     System.out.print(diff[i] + " , ");
        // }

        Arrays.sort(tasks, (a, b) -> 
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int min = 0, remain = 0;
        for( int i = 0; i < n; i++){
            if( i == 0 ){
                //initial condition - take whole limit:
                min += tasks[i][1];
                remain += tasks[i][1] - tasks[i][0];
            }
            else{
                if( remain < tasks[i][1]  ){
                    min += tasks[i][1] - remain;
                    remain = tasks[i][1] - tasks[i][0];
                }
                else{
                    remain -= tasks[i][0];
                }
            }

        }

        return min;
    }
}
