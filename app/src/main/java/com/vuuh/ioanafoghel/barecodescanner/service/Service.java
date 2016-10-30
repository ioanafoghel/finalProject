package com.vuuh.ioanafoghel.barecodescanner.service;

import com.vuuh.ioanafoghel.barecodescanner.model.Product;
import com.vuuh.ioanafoghel.barecodescanner.storage.Storage;

import java.util.ArrayList;

/**
 * Created by alinbaltatescu on 10/21/16.
 */
public class Service {
    public static ArrayList<Product> getProducts() {
        return Storage.getUniqueInstance().getProducts();
    }
    public static Product createProduct(String productImg, String productName,int productPrice, String productSize, String productColor, String productGender, String productCategory, int productArticleNo, int productItemNo, String productStore, int bareCode){
        Product product = new Product(productImg, productName, productPrice, productSize, productColor,productGender, productCategory, productArticleNo, productItemNo, productStore, bareCode);
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
