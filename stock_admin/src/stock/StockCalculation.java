public interface StockCalculation{
    public double vatOnTurnOver(double turnOverAmount);
    public double markupProfit(double sellingPrice, double buyingPrice);
    public double totalStockValue(double quantity, double sellingPrice);
    public double restockingFee(double buyingPrice);
}