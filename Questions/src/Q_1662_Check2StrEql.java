class Q_1662_Check2StrEql {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = "";
        for( int i = 0; i < word1.length; i++){
            first += word1[i];
        }
        String second = "";
        for( int i = 0; i < word2.length; i++){
            second += word2[i];
        }

        if(first.equals(second)){
            return true;
        }

        return false;
    }
}