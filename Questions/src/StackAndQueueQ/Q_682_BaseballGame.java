class Q_682_BaseballGame {
/*
Use Deque instead:

Deque<Integer> stack = new ArrayDeque();
From Deque Java doc (https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html):
Deques can also be used as LIFO (Last-In-First-Out) stacks. This interface should be used in preference to the legacy Stack class.

This stack overflow discussion goes into more details why one should use Deque over Stack: https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack
*/
    public static int calPoints(String[] operations) {
        int total = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < operations.length; i++){

            if( operations[i].equals("+") ){
                int new_element = stack.peek();
                int popped = stack.pop();
                new_element += stack.peek();
                stack.push(popped);
                stack.push(new_element);
            }
            else if( operations[i].equals( "C") ){
                stack.pop();
            }
            else if( operations[i].equals( "D") ){
                stack.push(stack.peek()*2);
            }
            else{
                //means exist integers :
                stack.push(Integer.parseInt(operations[i]) );
            }
        }

        while( !stack.isEmpty() ){
            total += stack.pop();
        }

        // total = Integer.parseInt(operations[0]);
        return total;
    }
}
