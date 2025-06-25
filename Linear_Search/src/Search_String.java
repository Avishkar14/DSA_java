public class Search_String {
    public static void main(String[] args) {
        String input = "Andy";
        char ToFind = 'y';
        String ans = Search(input, ToFind);
        System.out.println(ans);
        System.out.println(Search2(input, ToFind));
    }

    static String Search(String input, char ToFind) {
        if (input.length() == 0) {
            return "not found";
        } else {
            for(int i = 0; i < input.length(); ++i) {
                if (input.charAt(i) == ToFind) {
                    return "found";
                }
            }

            return "not found";
        }
    }

    static boolean Search2(String input, char elem) {
        if (input.length() == 0) {
            return false;
        } else {
            for(int i = 0; i < input.length(); ++i) {
                if (elem == input.charAt(i)) {
                    return true;
                }
            }

            return false;
        }
    }
}