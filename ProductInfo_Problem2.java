public class ProductInfo_Problem2 {
    public static void main(String[] args) {
        String brand = "HIGHLANDER";
        String productName = "Men Comfort Relaxed Fit Textured Spread Collar Casual Shirt";
        double rating = 4.6;
        int ratingCount = 5;

        // Price Details
        double mrp = 3949;
        int discountPercent = 81;
        double sellingPrice = 750;
        int size1 = 39;
        int size2 = 40;
        int size3 = 42;
        int size4 = 44;
        System.out.println("Brand: " + brand);
        System.out.println("Product Name: " + productName);
        System.out.println("Rating: " + rating + " stars");
        System.out.println("Number of Ratings: " + ratingCount);
        System.out.println("MRP: " + mrp);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Selling Price: " + sellingPrice);
        System.out.println("Available Sizes: " + size1 + ", " + size2 + ", " + size3 + ", " + size4);
    }
    
}
