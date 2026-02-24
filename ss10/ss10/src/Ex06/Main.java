package Ex06;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 1500));
        products.add(new Product("Mouse", 25));
        products.add(new Product("Keyboard", 75));
        products.add(new Product("Monitor", 300));

        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }

        });

        System.out.println("=== Sắp xếp theo giá (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\n=== Sắp xếp theo tên (Lambda) ===");
        products.forEach(System.out::println);
    }
}
