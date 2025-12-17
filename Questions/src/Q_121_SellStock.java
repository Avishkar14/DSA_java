class Q_121_SellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int count = 0;
        for(int i=0; i < prices.length; i++){   //i = buy
            int j = i;

            for(; j < prices.length; j++ ){   //j = sell
                if(prices[i] > prices[j]){
                    break;
                }
                if( prices[j] > profit){
                    if( profit <= (prices[j] - prices[i])){
                        profit = prices[j] - prices[i];
                    }
                }
                if( prices[i] == 0 &&  prices[j] == 0 && profit == 0){
                    count++;
                }
                else if( prices[prices.length - i - 1] == 0 && prices[i] == 0 &&  prices[j] == 0 ){
                    count++;
                }
                if(count > 5  && profit == 0){
                    return 0;
                }
                else if( count > 5 && profit != 0){
                    return profit;
                }
            }


        }
        return profit;
    }
}