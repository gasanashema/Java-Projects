import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        String itemCode = "", itemName = "", category = "";
        double quantity = 0, buyingPrice = 0, sellingPrice = 0, turnOverAmount = 0;

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter Item Code: ");
            itemCode = sc.nextLine().trim();
            if (itemCode.isEmpty()) {
                System.out.println("Provide Item Code");
            } else if (itemCode.length() < 4 || itemCode.length() > 10) {
                System.out.println("Item code must be alphanumeric abd between 10 and 4 characters");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter Item name: ");
            itemName = sc.nextLine().trim();
            if (itemName.isEmpty()) {
                System.out.println("Item name should not be empty");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter Category: ");
            category = sc.nextLine().trim();
            if (category.isEmpty()) {
                System.out.println("category name should not be empty");
            }else if (itemCode.length() < 2) {
                System.out.println("Category name should be greater than 2 values");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter Quantity: ");
            quantity = sc.nextDouble();
            if (quantity<=0) {
                System.out.println("Quantity must not be less than or equal to 0");
            }else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter Buying Price: ");
            buyingPrice = sc.nextDouble();
            if (buyingPrice<=0) {
                System.out.println("buying must not be less than or equal to 0");
            }else {
                break;
            }
        }
        
        while (true) {
            System.out.println("Enter Selling Price: ");
            sellingPrice = sc.nextDouble();
            if (sellingPrice<buyingPrice) {
                System.out.println("Selling price can't be less than buying price");
            }else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter Turnover Amount: ");
            sellingPrice = sc.nextDouble();
            if (sellingPrice<=0) {
                System.out.println("Turnover amount must be greater than 0");
            }else {
                break;
            }
        }
        
        sc.close();
        StockItem item = new StockItem(itemCode, itemName, category, quantity, buyingPrice, sellingPrice, turnOverAmount);
        
        System.out.println("------------- REPORT -------------");
        System.out.println("ITEM CODE: " + item.getItemCode());
        System.out.println("ITEM NAME: " + item.getItemName());
        System.out.println("CATEGORY : " + item.getCategory());
        System.out.println("QUANTITY : " + item.getQuantity());
        System.out.println("BUYING PRICE : " + item.getBuyingPrice());
        System.out.println("SELLING PRICE : " + item.getSellingPrice());
        System.out.println("TURN OVER AMOUNT : " + item.getTurnOverAmount());
        System.out.println("VAT : " + item.vatOnTurnOver(item.getTurnOverAmount()));
        System.out.println("MARKUP PROFIT : " + item.markupProfit(item.getSellingPrice(), item.getBuyingPrice()));
        System.out.println("RESTOCKING FEE : " + item.restockingFee(item.getBuyingPrice()));
        System.out.println("RESTOCKING FEE : " + item.totalStockValue(item.getQuantity(), item.getSellingPrice()));
        System.out.println("BALANCE : " + (item.getTurnOverAmount()-item.vatOnTurnOver(item.getTurnOverAmount())));
        
    }
}
