class Solution {
    public int maxProfit(int[] price) {
        int n = price.length;
        int min_price = price[0];
        int max_profit=0;
        for(int i=0;i<n;i++){
            if(price[i]<min_price){
                min_price=price[i];
            }
            else{
                int profit=price[i]-min_price;
                if(profit>max_profit){
                    max_profit=profit;
                }
            }
        }
        return max_profit;
    }
}
