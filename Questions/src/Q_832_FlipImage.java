import java.util.Arrays;

class Q_832_FlipImage {
    public static void main(String[] args) {
        int[][] image= {
                { 1, 1, 0},
                { 1, 0, 1},
                { 0, 0, 0} };
        System.out.println(Arrays.deepToString(flipAndInvertImage2(image)));
//        for(int i = 0; i < image.length; i++){
//            System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
//        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for( int i = 0; i < image.length; i++){
            for( int j = 0; j < image[i].length; j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }
                else{
                    image[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][image.length - 1 -j];
                image[i][image.length -1 - j] = temp;
            }
        }
        return image;
    }
    //Much better TC and also simpler logic: But SC needs improvement
    public static int[][] flipAndInvertImage2(int[][] image){
        for(int i =0; i < image.length; i++){
            for(int j = 0; j < (image[0].length+1)/2; j++ ){
                //swap to make it reverse;
                int temp = image[i][j];
                (image[i][j] ) = ~image[i][image[0].length - j - 1]& 1;
                image[i][image[0].length -j -1] = ~temp&1;

            }
        }
        return image;
    }
}