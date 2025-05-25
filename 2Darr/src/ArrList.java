import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(5);
        al.add(10);
        al.add(6);
        al.add(11);
        al.add(9);
        al.add(10);
        al.add(6);
        al.add(11);
        al.add(9);
        System.out.println("Array list is :"+al);


        al.set(0,12);
        System.out.println("Updated array list :"+al);

        al.add(0,1);
        System.out.println("adding element at index in  array list :"+al);

        al.remove(3);
        System.out.println("removing element using index array list :"+al);

    }
}
