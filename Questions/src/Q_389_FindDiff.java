import java.util.HashMap;
class Q_389_FindDiff {
    public static char findTheDifference(String s, String t) {
        //Store char in hash table and map accodringly

        HashMap<Character , Integer> map = new HashMap<>();
//Iterate s
        for( int i = 0; i < s.length(); i++ ){
            //s is shorter so for that until t.len - 1:
            if( !map.containsKey(s.charAt(i)) ){
                // map.put(s.charAt(i));
                //edit val - char ,  get curr val + 1:
                map.put(s.charAt(i), 1);
            }
            else{
                map.put( s.charAt(i) , map.get(s.charAt(i)) + 1);
            }
        }
//Iterate l
        for( int i = 0; i < t.length(); i++ ){

            if( !map.containsKey(t.charAt(i)) ){
                return t.charAt(i);
            }

            if(map.get(t.charAt(i)) > 0 &&  map.containsKey(t.charAt(i)) ){
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
            else{
                return t.charAt(i);
            }
        }

        return 'o';
    }
}
