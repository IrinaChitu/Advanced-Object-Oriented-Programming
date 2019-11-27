package tasks;

import tasks.model.*;

public class MainClass {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Product one");

        FoodProduct foodProduct = new FoodProduct();
        foodProduct.setName("Product two");

        System.out.println(product.getName());
        System.out.println(foodProduct.getName());

        Product foodProd = new FoodProduct();
        foodProd.setName("foodProd");
        System.out.println(foodProd.getName()); // apeleaza metoda din FoodProduct()


        Category drink = new Category("Drink", "pack");
        Category soda = new Category("Soda", "juicy", drink);



//        User user1 = new User(24, "username", "password");
//        User user2 = new User(24, "usernamesdadsa", "password");
//        System.out.println("user1 == user2 : " + (user1 == user2));
//        System.out.println("user1.equals( user2) : " + user1.equals(user2));
//        Category category = new Category("category 1", "description 1", (Category)null);
//        Product product = new Product(category, (Price)null, "produs name", "produs description");
//        Product foodProduct = new FoodProduct(category, (Price)null, "food product name", "food product description");
//        System.out.println("product getName : " + product.getName());
//        System.out.println("foodProduct getName : " + foodProduct.getName());
//
//        try {
//            Product productDuplicate = foodProduct.clone();
//            System.out.println("productDuplicate: " + productDuplicate);
//        } catch (CloneNotSupportedException var7) {
//            var7.printStackTrace();
//        }

    }
}
