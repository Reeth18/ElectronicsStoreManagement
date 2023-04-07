package ElectronicsStore;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Products> products;

    public ProductList(Products[] productsArray) {
        products = new ArrayList<>();
        for (Products product : productsArray) {
            products.add(product);
        }
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Products product : products) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Specifications: " + product.getSpecifications());
            System.out.println("Cost: " + product.getCost());
            System.out.println("Counts: " + product.getCount());
            System.out.println();
        }
    }
}
