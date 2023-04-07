package ElectronicsStore;

import java.util.Scanner;

public class EditProduct {
    public void edit(Products[] products, int id) {
        Scanner sc = new Scanner(System.in);
        for (Products product : products) {
            if (product.getId() == id) {
                System.out.println("Enter new Specifications for product " + product.getId() + ": ");
                String specifications = sc.nextLine();
                product.setSpecifications(specifications);

                System.out.println("Enter new Cost for product " + product.getId() + ": ");
                double cost = sc.nextDouble();
                product.setCost(cost);

                System.out.println("Enter new Counts for product " + product.getId() + ": ");
                int count = sc.nextInt();
                product.setCount(count);

                System.out.println("Product details updated successfully.");
                return;
            }
        }
        System.out.println("Product Not Found.");
    }

}
