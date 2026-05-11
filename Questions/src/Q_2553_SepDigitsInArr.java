class Q_2553_SepDigitsInArr{
    public static int[] separateDigits(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int temp = nums[i];

            while( temp > 0 ){
                int rem = temp%10;
                count++;
                temp /= 10;
            }
        }

        int[] ans = new int[count];
        System.out.print(count);
        int j = n - 1;
        int i = count - 1; 
        
        while( j >= 0 && i >= 0 ){
            int temp = nums[j];

            while( temp > 0 ){
                int rem = temp%10;
                ans[i] = rem;
                i--;
                temp /= 10;
            }

            j--;
        }

        return ans;
    }
}
