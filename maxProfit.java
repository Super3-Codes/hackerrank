  public int maxProfit(int[] prices) {
       int buyPrice=Integer.MAX_VALUE,profit=0,maxProfit=0;
        
       for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
       }
            return maxProfit;
    }
