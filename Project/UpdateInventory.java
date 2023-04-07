package ElectronicsStore;

public class UpdateInventory {
    public void Update(Products[] products, int id, int count, int choice) {
        for (Products product : products) {
            if (product.getId() == id) {
                if (choice == 1) {
                    product.setCount(product.getCount() + count);
                    System.out.println("Inventory Updated Successfully.");
                    return;
                } else if (choice == 2) {
                    if (product.getCount() < count) {
                        System.out.println("Not enough Inventory to delete.");
                        return;
                    } else {
                        product.setCount(product.getCount() - count);
                        System.out.println("Inventory Updated Successfully.");
                        return;
                    }
                }

            }
        }
        System.out.println("Product Not Found.");
    }
}
