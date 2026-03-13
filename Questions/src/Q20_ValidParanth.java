class Q20_ValidParanth {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        // if(s.length())
        
        for(int i = 0; i < s.length(); i++){

            if( ((s.charAt(0) == ')') || (s.charAt(0)== ']') || (s.charAt(0) == '}')) && (s.length() % 2 == 1) ){
            return false;
        }

            if( (s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '[') ){
                stack.push(s.charAt(i));
            }
            else{
                if( (!stack.isEmpty()) && (stack.peek() == '(' ) && (s.charAt(i)== ')')){
                    stack.pop();
                }
                else if(  (!stack.isEmpty()) &&(stack.peek() == '{' ) && (s.charAt(i) == '}') ){
                    stack.pop();
                }
                else if( (!stack.isEmpty()) &&(stack.peek() == '[' ) && (s.charAt(i) == ']')){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }

        if( stack.isEmpty()){
            return true;
        }
        return false;
    }
}
