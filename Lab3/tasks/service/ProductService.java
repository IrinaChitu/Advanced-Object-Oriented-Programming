package tasks.service;

import tasks.model.Category;
import tasks.model.Price;
import tasks.model.Product;

public class ProductService {
    private static ProductService ourInstance = new ProductService();
    private static Product[] listOfProducts = new Product[3];

    //private ProductService() {}
    private ProductService() {
        listOfProducts[0] = new Product(new Category(), new Price(), "Food", "easy to cook");
        listOfProducts[0] = new Product(new Category(), new Price(), "Water", "cold");
        listOfProducts[0] = new Product(new Category(), new Price(), "Tea", "blueberries");
    }

    public static ProductService getInstance() {
        return ourInstance;
    }


    public Product getUserByName(String name) {
        for(Product p: listOfProducts) {
            if(p.getName() == name) {
                return p;
            }
        }
        return null;
    }

    public Product getUserByCategory(Category category) {
        for(Product p: listOfProducts) {
            if(p.getCategory() == category) {
                return p;
            }
        }
        return null;
    }
}
