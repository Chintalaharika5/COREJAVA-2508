package InventoryManagement;

public class InventorySystem {
    public static void main(String[] args) {
        String productName = "Laptop";
        int quantity = 50;
        double unitPrice = 45000.0;
        int reorderThreshold = 20;
        boolean forSale = true;

        double stockValue = quantity * unitPrice;
        boolean needsReorder = quantity < reorderThreshold;
        boolean isAvailable = quantity > 0 && forSale;

        quantity--; // simulate a sale

        System.out.println("=== Inventory Summary ===");
        System.out.println("Product: " + productName);
        System.out.println("Stock Value: ₹" + stockValue);
        System.out.println("Reorder Needed: " + needsReorder);
        System.out.println("Available for Sale: " + isAvailable);
        System.out.println("Updated Quantity: " + quantity);
    }
    
}
