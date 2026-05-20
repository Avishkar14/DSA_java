class Q_2657_CommonPrefix2Arr {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] common = new int[n];
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for( int i = 0; i < n; i++ ){
            list.add(A[i]);
            for( int j = 0; j <= i; j++ ){
                if( list.contains(B[j])  ){
                    count++;
                    common[i] = count;
                }
            }
            count = 0;
            
        }

        return common;
    }
}
