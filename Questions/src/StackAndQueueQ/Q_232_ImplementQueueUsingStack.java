package StackAndQueueQ;

import java.util.Stack;

public class Q_232_ImplementQueueUsingStack {

    class MyQueue {
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();
        // private int size = 0; // to keep track of stack elements
        public MyQueue() {
        }

        public void push(int x) {
            stack1.push(x);
            // size++;
        }

        public int pop() {
            //needs peek and empty
            int num;
            if(stack1.empty()){
                return -1;
            }
            else{
                while( !stack1.isEmpty()){
                    stack2.push(stack1.peek());
                    stack1.pop();
                }
                num = stack2.peek();
                stack2.pop();
                while( !stack2.isEmpty()){
                    stack1.push(stack2.peek());
                    stack2.pop();
                }
                // size--;
            }

            return num;
        }

        public int peek() {
            //needs empty
            if(stack1.isEmpty()){
                return -1;
            }
            //not empty:
            while( !stack1.isEmpty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }
            int num = stack2.peek();
            while( !stack2.isEmpty()){
                stack1.push(stack2.peek());
                stack2.pop();
            }
            return num;
        }

        public boolean empty() {
            if(  stack1.isEmpty()){
                return true;
            }
            return false;
        }
    }

}
