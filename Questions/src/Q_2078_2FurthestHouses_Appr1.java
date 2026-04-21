class Q_2078_2FurthestHouses_Appr1 {
    public static int maxDistance(int[] colors) {
        int max = 0;
        //forward Traverse - with n - 1 as fixed house to calc dist
        for(int i = 0; i < colors.length; i++){
            if( (colors[i] != colors[colors.length - 1]) && 
                (max < colors.length - 1 - i)){
                max = colors.length - 1 - i;
                break;
            }
        }

        //Backward traverse - with 0 as fixed house to calc dist
        for(int i = colors.length - 1; i > -1;  i--){
            if( (colors[i] != colors[0]) && 
                (max < i)){
                max = i;
                break;
            }
        }

        return max;
    }
}
