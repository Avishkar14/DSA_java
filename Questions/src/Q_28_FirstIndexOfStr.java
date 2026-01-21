    class Q_28_FirstIndexOfStr {
        public static void main(String[] args) {
            System.out.println(strStr("mississippi" , "issip"));
        }
        public static int strStr(String haystack, String needle) {
            int count = 0;
            for( int i = 0; i < haystack.length() ; i++){

                if(haystack.charAt(i) == needle.charAt(count)){
                    count++;
                }
                else{
                    count = 0;//reset   
                    if(haystack.charAt(i) == needle.charAt(count)){
                        count++;
                    }
                }
                if( count == needle.length()){
                    return i-needle.length()+1;
                }
            }
            return -1;
        }
    }


    //if haystack.startswith(needle)
    //retrun 