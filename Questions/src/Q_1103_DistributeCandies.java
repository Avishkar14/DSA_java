class Q_1103_DistributeCandies {
    //psvm
    public static int[] distributeCandies(int candies, int num_people) {

        int[] ans = new int[num_people];
        int give = 1;
        
        while( candies != 0 ){

            for( int i = 0; i < ans.length ; i++){
                if( candies >= give){
                    ans[i] += give;
                    candies -= give;
                    give++;
                }
                else{
                    //candies less
                    ans[i] += candies;
                    candies = 0; 
                }
            }
        }
        return ans;
    }
}
