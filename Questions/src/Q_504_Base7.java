class Q_504_Base7 {
    public static String convertToBase7(int num) {
        String ans = "";
        int flag = 0;
        if( num < 0){
            flag = 1;
            num = -num;
        }
        if( num == 0){
            return 0+"";
        }
        while(num > 0){
            int rem = num % 7;
            num /= 7;
            ans = ""+ rem + ans;
        }

        if( flag == 1){
            ans = "-"+ans;
        }
        return ans;
    }
}
