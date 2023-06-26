package ElectronicsStoreNew;

import java.util.*;

// Parent class for Electronics Store
class ElectronicsStore {
    protected String name;
    protected String location;
    protected String branch;

    // Constructor
    public ElectronicsStore(String name, String location, String branch) {
        this.name = name;
        this.location = location;
        this.branch = branch;
    }

    // Getters and setters for store details
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

// Parent class for Products
class Product {
    protected String name;
    protected double cost;
    protected int count;

    // Constructor
    public Product(String name, double cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    // Getters and setters for product details
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Cost: $" + cost);
        System.out.println("Count: " + count);
    }
}

// Child class for Mobile products
class Mobile extends Product {
    private String manufacturer;

    // Constructor
    public Mobile(String name, double cost, int count, String manufacturer) {
        super(name, cost, count);
        this.manufacturer = manufacturer;
    }

    // Getter and setter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

// Child class for Laptop products
class Laptop extends Product {
    private String manufacturer;

    // Constructor
    public Laptop(String name, double cost, int count, String manufacturer) {
        super(name, cost, count);
        this.manufacturer = manufacturer;
    }

    // Getter and setter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Create an Electronics Store
        ElectronicsStore store = new ElectronicsStore("My Electronics Store", "New York", "Branch 1");

        // Create Mobile products
        Mobile mobile1 = new Mobile("iPhone 12", 999.99, 10, "Apple");
        Mobile mobile2 = new Mobile("Galaxy S21", 899.99, 15, "Samsung");

        // Create Laptop products
        Laptop laptop1 = new Laptop("MacBook Pro", 1999.99, 5, "Apple");
        Laptop laptop2 = new Laptop("Dell XPS 15", 1499.99, 8, "Dell");

        // Add products to inventory
        List<Product> inventory = new ArrayList<>();
        inventory.add(mobile1);
        inventory.add(mobile2);
        inventory.add(laptop1);
        inventory.add(laptop2);

        // Display product list
        System.out.println("Product List:");
        for (Product product : inventory) {
            System.out.println(product.getName());
        }

        // Display product count
        System.out.println("\nProduct Count (iPhone 12): " + mobile1.getCount());

        // Display product details
        System.out.println("\nProduct Details (Galaxy S21):");
        for (Product product : inventory) {
            if (product.getName().equals("Galaxy S21")) {
                product.displayProductDetails();
                break;
            }
        }

        // Update product details
        laptop1.setCost(1899.99);
        laptop1.setCount(6);

        // Display updated product details
        System.out.println("\nUpdated Product Details (MacBook Pro):");
        laptop1.displayProductDetails();

        // Update inventory
        inventory.remove(mobile2);

        // Display updated product list
        System.out.println("\nUpdated Product List:");
        for (Product product : inventory) {
            System.out.println(product.getName());
        }

        // Display store details
        System.out.println("\nStore Details:");
        System.out.println("Name: " + store.getName());
        System.out.println("Location: " + store.getLocation());
        System.out.println("Branch: " + store.getBranch());
    }
}
