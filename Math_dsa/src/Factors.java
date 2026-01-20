import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1sort(36);
    }
    static void factors1( int n){
        for(int i = 1; i*i <= n; i++){
            if( n%i == 0 ){
                if( n/i == i){
                    System.out.print(i+ " ");
                }
                else
                    System.out.print(i+ " " + n/i+ " ");
            }
        }
    }

    //Same code but printing in sorted by storing n/i terms
    //therefore both time and space will be O(sqrt(n))
    static void factors1sort( int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if( n%i == 0 ){
                if( n/i == i){
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print(i+ " " );
                    list.add(n/i);
                }

            }
        }
        for( int i = list.size()-1 ; i >= 0; i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}
