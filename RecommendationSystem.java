import java.util.*;

public class RecommendationSystem {

    static class Product {
        int id;
        String name;
        String category;

        Product(int id, String name, String category) {
            this.id = id;
            this.name = name;
            this.category = category;
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", "Electronics"));
        products.add(new Product(2, "Smartphone", "Electronics"));
        products.add(new Product(3, "Headphones", "Electronics"));
        products.add(new Product(4, "Java Book", "Education"));
        products.add(new Product(5, "Python Book", "Education"));

        String userPreference = "Electronics";

        System.out.println("User Preference: " + userPreference);
        System.out.println("\nRecommended Products:");

        for (Product product : products) {

            if (product.category.equalsIgnoreCase(userPreference)) {

                System.out.println(
                        product.id + " - " + product.name
                );
            }
        }
    }
}
