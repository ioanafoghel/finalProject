package com.example.alinbaltatescu.barcodescanner.storage;

import com.example.alinbaltatescu.barcodescanner.model.Product;

import java.util.ArrayList;

/**
 * Created by alinbaltatescu on 10/21/16.
 */
public class Storage {
    private ArrayList<Product> products = new ArrayList<>();
    private static Storage uniqueInstance;

    private Storage() {
    }

    public static Storage getUniqueInstance()
    {
        if (uniqueInstance == null){
            uniqueInstance = new Storage();
        }
        return uniqueInstance;
    }

    public ArrayList<Product> getProducts()
    {
        return products;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }
    public Product getProductByIndex(int index)
    {
        return products.get(index);
    }
}
