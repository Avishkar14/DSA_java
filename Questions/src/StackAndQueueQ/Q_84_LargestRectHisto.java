package StackAndQueueQ;

import java.util.Stack;

class Q_84_LargestRectHisto {
    public static int largestRectangleArea(int[] heights) {
        
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        for(int i = 0; i < heights.length; i++){
            if( stack.isEmpty() ){
                stack.push(i);
                if(max <= heights[i]){
                    max = heights[i];
                }
            }
            else if( heights[stack.peek()] <= heights[i] ){
                stack.push(i);
            }
            else{
                // peek > i ;
                while( !stack.isEmpty() && heights[stack.peek()] >= heights[i] ){
                    int index = stack.peek();
                    stack.pop();
//                                          //left              //right
                    if( !stack.isEmpty() ){
                        if( max < heights[index]*(   i - 1 - stack.peek() ) ){
                            max = heights[index]*(  i - 1 - stack.peek()) ;
                        }

                    }
                    else{
                        if( max < heights[index]*(  i ) ) { //-1
                            max = heights[index]*( i );     //-1
                        }
                    }
                    
                }
                stack.push(i);
            }

        }

        if( !stack.isEmpty() ){
            int size = heights.length;
            while( !stack.isEmpty() ){
                
                int index = stack.peek();
                stack.pop();

                if( !stack.isEmpty() ){
                    if( max < heights[index]*( size -1 - stack.peek() ) ){
                        max = heights[index]*( size -1 - stack.peek() );
                    }
                }
                else{
                    if (max < heights[index] * size) {
                        max = heights[index] * size;
                    }
                }

                //NO NEED TO FIND LEFT GREATER elements as if something is at last then its most smallest element in whole array
                
                // if( stack.isEmpty()){
                //     int i = 0;
                //     while( (i < index) && ( heights[ index - i] >= heights[ index ] ) ){
                //         i++;
                //     }
                //     if( max < heights[index]*( size - index + i ) ){
                //         max = heights[index]*( size - index + i);
                //     }

                // }
            }
        }

        return max;
    }
}
