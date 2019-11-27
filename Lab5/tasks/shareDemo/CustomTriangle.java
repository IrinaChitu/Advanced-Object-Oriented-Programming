package tasks.shareDemo;

public class CustomTriangle extends Triangle implements NamedObject {
    String name;
    String description;

    public CustomTriangle() {}
    public CustomTriangle(double sideA, double sideB, double sideC, String name, String description) {
        super(sideA, sideB, sideC);
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
