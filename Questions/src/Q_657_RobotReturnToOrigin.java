class Q_657_RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int i = 0;
        int count_ud = 0;
        int count_lr = 0;
        while( i < moves.length()){
            if(  moves.charAt(i) == 'U'){
                count_ud++;
            }
            else if( moves.charAt(i) == 'L' ){
                count_lr++;
            }
            else if( moves.charAt(i) == 'D'){
                count_ud--;
            }
            else{
                //'R'
                count_lr--;
            }
            i++;
        }
        return (count_ud == 0)&&( count_lr == 0);
    }
}
