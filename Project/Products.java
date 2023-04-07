package ElectronicsStore;

public class Products {
    private int id;
    private String name;
    private String specifications;
    private double cost;
    private int count;

    public Products(int proId, String nameNew, String specs, double price, int counts) {
        this.id = proId;
        this.name = nameNew;
        this.specifications = specs;
        this.cost = price;
        this.count = counts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
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

}
