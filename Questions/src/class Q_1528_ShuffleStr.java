class Q_1528_ShuffleStr {
    public static String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            ans[indices[i]] = s.charAt(i);
        }

        String out = new String(ans);

        return out;
    }
}
