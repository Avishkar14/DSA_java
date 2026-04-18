package StackAndQueueQ;

import java.util.Stack;

class Q_921_MinAddPara {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        // int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else{ 
                // ')'
                if( !stack.isEmpty() ){
                    if( stack.peek() == '('){
                        stack.pop();
                    }
                    else{
                        stack.push(')');
                    }
                }
                else{ //empty
                    stack.push(')');
                }
            }
        }
        return stack.size();
    }
} 
