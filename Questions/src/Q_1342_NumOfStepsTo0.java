class Q_1342_NumOfStepsTo0 {
    //here will be psvm  
    public static int numberOfSteps(int num) {
        int count = 0;
        while( num != 0){
            
            if( num%2 == 0){
                //even
                num = num/2;
            }
            else{
                //odd
                num = num -1;
            }
            count++;
        }
        return count;
    }
}
