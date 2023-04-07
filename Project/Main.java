package ElectronicsStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        Products[] products = new Products[3];
        products[0] = new Products(1, "Laptop", "16GB RAM", 50000.0, 10);
        products[1] = new Products(2, "Smartphone", "8GB RAM", 20000.0, 20);
        products[2] = new Products(3, "Tablet", "4GB RAM", 15000.0, 15);

        ProductList productList = new ProductList(products);
        ProductCount productCount = new ProductCount();
        ViewProductDetails viewProductDetails = new ViewProductDetails();
        EditProduct editProduct = new EditProduct();
        UpdateInventory updateInventory = new UpdateInventory();

        while (true) {
            System.out.println("1. View Product List");
            System.out.println("2. View Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product Details");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                productList.displayProducts();
            } else if (choice == 2) {
                System.out.print("Enter product ID: ");
                int id = scanner.nextInt();
                int count = productCount.getCount(products, id);
                if (count != -1) {
                    System.out.println("Product count: " + count);
                } else {
                    System.out.println("Product not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter product ID: ");
                int id = scanner.nextInt();
                viewProductDetails.displayDetails(products, id);
            } else if (choice == 4) {
                System.out.print("Enter product ID: ");
                int id = scanner.nextInt();
                editProduct.edit(products, id);
            } else if (choice == 5) {
                System.out.print("Enter 1 to add product or 2 to delete product: ");
                int updateChoice = scanner.nextInt();
                System.out.print("Enter product ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter product count: ");
                int count = scanner.nextInt();
                updateInventory.Update(products, id, count, updateChoice);
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
