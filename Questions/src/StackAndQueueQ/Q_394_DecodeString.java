package StackAndQueueQ;

import java.util.Stack;

class Q_394_DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
        //o/p: "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"
    }
    public static String decodeString(String s) {
        
        Stack<String> num = new Stack<>();
        Stack<Character> brac = new Stack<>();
        String ans = "";
        int i = 0;
        
        while( i < s.length()){

            char ch = s.charAt(i);
            
            if( (ch == '[') || ( ch == ']' ) ){
               
                if( ch == '[' ){
                    brac.push(ch);
                }
                else{
                    // ]
                    brac.pop();
                    
                    //call something to update the string ans :
                    
                    String string = "";                   
                    //group the aplabets into a string:
                    while( !num.isEmpty() && (num.peek().charAt(0) > '9') ){
                        string = num.pop() + string;
                    }
                    
                    //Now convert digits into proper number :
                    int pow = 1;
                    int digits = 0;
                    while( !num.isEmpty() && (num.peek().charAt(0) <= '9') ){
                        digits += (num.pop().charAt(0) - '0')*pow;
                        pow *= 10;
                    }

                    String temp = "";
                    for( int j=0; j < digits; j++){
                        temp += string;
                    }
                    if( !temp.isEmpty()){
                        num.push(temp);
                    }
                    
                    // return temp;

                }
            }
            else if( ch >= '0' && ch <= '9' ){
                //can do this while popping - first convert it into number : as 1 to 300 possible
                num.push(String.valueOf(ch));
            }
            else{
                //possible alphabets :
                num.push(String.valueOf(ch));
            }
            i++;
        }

        while( !num.isEmpty() ){
            ans = num.pop() + ans;
        }

        return ans;

        // return "ans" + (int)('z') ;
    }
}