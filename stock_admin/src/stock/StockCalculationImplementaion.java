public class StockCalculationImplementaion implements StockCalculation{

    @Override
    public double markupProfit(double sellingPrice, double buyingPrice) {
        return sellingPrice - buyingPrice;
    }

    @Override
    public double restockingFee(double buyingPrice) {
       
        return buyingPrice * (5/100);
    }

    @Override
    public double totalStockValue(double quantity, double sellingPrice) {
       
        return quantity * sellingPrice;
    }

    @Override
    public double vatOnTurnOver(double turnOverAmount) {
        return turnOverAmount*0.18;
    }
    
}
