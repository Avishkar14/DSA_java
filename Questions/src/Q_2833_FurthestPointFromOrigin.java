class Q_2833_FurthestPointFromOrigin {
    public static int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int empty = 0;
        for(int i = 0; i < moves.length(); i++){
            if( moves.charAt(i) == 'L' ){
                left++;
            }
            else if( moves.charAt(i) == 'R' ){
                right++;
            }
            else{
                empty++;
            }
        }

        if( left >= right ){
            return empty + left - right;
        }
        
        return empty + right - left;
    }
}
