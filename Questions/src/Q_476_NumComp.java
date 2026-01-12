import java.util.ArrayList;

class Q_476_NumComp {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        //First , get to know no.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while( num > 0){
            arr.add( num & 1);
            num = num >> 1;
        }
        //invert bits
        for(int i= 0; i < arr.size(); i++){
            // ~arr.get(i) = arr.get(i);
            arr.set( i,  ~arr.get(i)&1);
        }
        int n = 2;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++ ){
            if( i == 0 && arr.get(i) == 1){
                sum += 1;
            }
            else if( i != 0){
                sum = sum +  arr.get(i)*n;
                n *= 2;
            }
        }
        return sum;
    }
}