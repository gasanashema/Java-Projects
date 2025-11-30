public class StockItem extends StockCalculationImplementaion{
    private String itemCode,itemName,category;
    private double quantity,buyingPrice,sellingPrice,turnOverAmount;

    

    public StockItem(String itemCode, String itemName, String category, double quantity, double buyingPrice,
            double sellingPrice, double turnOverAmount) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.category = category;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.turnOverAmount = turnOverAmount;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        
        this.itemCode = itemCode;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public double getBuyingPrice() {
        return buyingPrice;
    }
    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public double getTurnOverAmount() {
        return turnOverAmount;
    }
    public void setTurnOverAmount(double turnOverAmount) {
        this.turnOverAmount = turnOverAmount;
    }

    
}
