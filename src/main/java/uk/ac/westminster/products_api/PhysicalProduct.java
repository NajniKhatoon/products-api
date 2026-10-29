//A PhysicalProduct IS-A Product because it inherits id,name and price from Product
//A PhysicalProduct HAS-A weight and dimensions because these describe the physical item.

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){}
    public PhysicalProduct(long id, String name, double price, double weightKg , String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }
    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions() {
        return dimensions;
    }
}
