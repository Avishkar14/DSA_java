class Q_1678_GoalParser {
    public static String interpret(String command) {
        String ans = "";
        while( command.length() > 0){

        
            if( command.startsWith("()") ){
                ans += "o";
                command = command.substring( 2 );
            }
            else if( command.startsWith("(al)") ){
                ans += "al";
                command = command.substring( 4 );
            }
            else{
                //"G"
                ans += "G";
                command = command.substring( 1 );
            }
        }

        return ans;
    }
}
