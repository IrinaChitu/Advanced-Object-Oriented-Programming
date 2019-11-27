package tasks.model;

public class FoodProduct extends Product implements Cloneable {
    public FoodProduct() {}
    public FoodProduct(Category category, Price price, String name, String smallDescription) {
        super(category, price, name, smallDescription);
    }

    @Override
    public String getName() {
        System.out.println("Using extended");
        return super.getName();
    }

    @Override // nu are
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
