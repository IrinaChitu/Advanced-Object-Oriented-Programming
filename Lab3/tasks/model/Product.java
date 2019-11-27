package tasks.model;

public class Product implements Cloneable {
    private Category category;
    private Price price;
    private String name;
    private String smallDescription;

    public Product() {}

    public Product(Category category, Price price, String name, String smallDescription) {
        this.category = category;
        this.price = price;
        this.name = name;
        this.smallDescription = smallDescription;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public void setPrice(Price price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }
    public Category getCategory() {
        return category;
    }
    public Price getPrice() {
        return price;
    }
    public String getName() {
        System.out.println("Using Super");
        return name;
    }
    public String getSmallDescription() {
        return smallDescription;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


//    public Product clone() throws CloneNotSupportedException {
//        Product newObject = (Product)super.clone();
//        if (this.category != null) {
//            try {
//                newObject.setCategory((Category)this.category.clone());
//            } catch (CloneNotSupportedException var3) {
//                var3.printStackTrace();
//            }
//        }
//
//        return newObject;
//    }
//
//    protected void finalize() throws Throwable {
//        System.out.println("finalize for producat : " + this.name);
//        super.finalize();
//    }

}
