import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimAL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ArrL= new ArrayList<>();

        //initialization
        for (int i=0; i<3; i++){
            ArrL.add(new ArrayList<>());
        }

        //for adding elements
        for (int i=0; i<3; i++){
            for (int j=0; j<3;j++){
                ArrL.get(i).add(in.nextInt());
            }
        }
        System.out.println(ArrL);

    }
}
