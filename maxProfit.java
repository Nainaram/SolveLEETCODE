public class maxProfit {
        public static void main(String[] args) {
            
                int n =5;
                int intialPrice =0;
                int stockprices [] ={ -39957, -17136, 35466, 21820, -26711};
                int MinStockPrice = Integer.MAX_VALUE;
                int presentStockPrice = 0;
                for(int i =0;i<stockprices.length;i++){
                    presentStockPrice+=stockprices[i];
                    if(presentStockPrice<MinStockPrice){
                        MinStockPrice = presentStockPrice;
                    }
                }
                System.out.println(MinStockPrice);
        }
}
