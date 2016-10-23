package com.example.alinbaltatescu.barcodescanner.service;

import com.example.alinbaltatescu.barcodescanner.model.Product;
import com.example.alinbaltatescu.barcodescanner.storage.Storage;

import java.util.ArrayList;

/**
 * Created by alinbaltatescu on 10/21/16.
 */
public class Service {
    public static ArrayList<Product> getProducts() {
        return Storage.getUniqueInstance().getProducts();
    }
    public static Product createProduct(int productImg, String productName,String productPrice, String productSize, String productColor, String productGender, String productCategory, String productArticleNo, String productItemNo, String productStore){
        Product product = new Product(productImg, productName, productPrice, productSize, productColor,productGender, productCategory, productArticleNo, productItemNo, productStore);
        Storage.getUniqueInstance().addProduct(product);
        return product;
    }

    public static void deleteProduct(Product product){
        Storage.getUniqueInstance().removeProduct(product);
    }

    public static Product getProductByIndex(int index){
        return Storage.getUniqueInstance().getProductByIndex(index);
    }
}
