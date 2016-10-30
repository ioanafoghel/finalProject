package com.vuuh.ioanafoghel.barecodescanner.storage;

import com.vuuh.ioanafoghel.barecodescanner.model.Product;
import java.util.ArrayList;

/**
 * Created by alinbaltatescu on 10/21/16.
 */
public class Storage {
    private ArrayList<Product> products = new ArrayList<>();
    private static Storage uniqueInstance;

    private Storage() {
        products = new ArrayList<>();
        createDummyData();
    }

    public static Storage getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Storage();
        }
        return uniqueInstance;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product getProductByIndex(int index) {
        return products.get(index);
    }

    private void createDummyData() {

        String imageURL = "http://d2zus9315f01od.cloudfront.net/cache/images/products/33150/55812/actress-oversize-t-shirt.cb0c8f745aad.jpg";

        Product prod1 = new Product(imageURL, "test1", 45, "M", "blue", "male", "jeans", 12, 50, "Stylepit", 123456);
        Product prod2 = new Product(imageURL, "test1", 45, "M", "blue", "male", "jeans", 12, 50, "Stylepit", 123457);
        Product prod3 = new Product(imageURL, "test1", 45, "M", "blue", "male", "jeans", 12, 50, "Stylepit", 123458);

        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
    }
}
