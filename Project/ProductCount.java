package ElectronicsStore;

public class ProductCount {
    public int getCount(Products[] products, int id) {
        for (Products product : products) {
            if (product.getId() == id) {
                return product.getCount();
            }
        }
        return -1; // product not found
    }
}
