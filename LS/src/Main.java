public class Main{
    public static void main(String[] args) {
        String name= "jackie";
        char find_ele = 'k';
        System.out.println(StringSearch(name , find_ele , 0, 3));
// System.out.println(StringSearch(name , find_ele ));
    }

    public static String StringSearch( String name , char find_ele , int start , int end){

        if ( name==null ){
            return "element not found";
        }
//        for (int i=0; i < name.length() ; i++)
        for (int i=0; i < name.length() ; i++){
            char curr_elem = name.charAt(i);

            if ( find_ele == curr_elem){
                return "found element";
            }
        }
        return "element not found ";
    }
}