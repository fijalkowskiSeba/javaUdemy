public class Furniture {
    private String      name;
    private Dimensions  dimensions;
    private int         quantity;

    public Furniture(String name, Dimensions dimensions, int quantity) {
        this.name = name;
        this.dimensions = dimensions;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getQuantity() {
        return quantity;
    }
}
