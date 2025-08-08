import java.util.ArrayList;
import java.util.List;
//1431. Kids With the Greatest Number of Candies
public class Q_1431 {
    public static void main(String[] args) {
        int[] candies={2,8,7};
        int extraCandies=1;
        System.out.println(kidsWithCandies(candies , extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //find max val element:
        int max=0;
        //boolean[] result = new boolean[candies.length];
        List<Boolean> result = new ArrayList<>(candies.length);
        for(int i=0; i < candies.length; i++) {
            //max=candies[i];
            if (candies[i] >= max) {
                max = candies[i];
            }
        }
        for(int i=0; i < candies.length; i++){

            if( (candies[i] + extraCandies ) >= max ){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}