package tasks.model;

public class Category implements Cloneable {
    private String name;
    private String description;
    private Category parent;

    public Category() {}

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Category(String name, String description, Category parent) {
        this.name = name;
        this.description = description;
        this.parent = parent;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setParent(Category parent) {
        this.parent = parent;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Category getParent() {
        return parent;
    }

    @Override
    public Object clone() throws CloneNotSupportedException { //if the class did not implement Cloneable interface, then the exception would have been thrown
        return super.clone();
    }
}

