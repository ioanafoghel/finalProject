package com.vuuh.ioanafoghel.barecodescanner.model;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ioanafoghel on 10/19/16.
 */
public class Product {
    private String image_URL;
    private int product_price;
    private int product_articleNo,
            product_itemNo;
    private String
            product_name,
            product_size,
            product_color,
            product_gender,
            product_category,
            product_store;
    private int bareCode;

    public Product(String product_image, String product_name, int product_price, String product_size, String product_color, String product_gender, String product_category, int product_articleNo, int product_itemNo, String product_store, int bareCode) {
        this.setImage_URL(product_image);
        this.setProduct_name(product_name);
        this.setProduct_price(product_price);
        this.setProduct_size(product_size);
        this.setProduct_color(product_color);
        this.setProduct_gender(product_gender);
        this.setProduct_category(product_category);
        this.setProduct_articleNo(product_articleNo);
        this.setProduct_itemNo(product_itemNo);
        this.setProduct_store(product_store);
        this.bareCode = bareCode;
    }

    public Product(HashMap<String, Object> productMap) {
        this.image_URL = (String) productMap.get("image_URL");
        this.product_price = Integer.parseInt(productMap.get("product_price").toString());
        this.product_articleNo = Integer.parseInt(productMap.get("product_articleNo").toString());
        this.product_itemNo = Integer.parseInt(productMap.get("product_itemNo").toString());
        this.product_name = (String) productMap.get("product_name");
        this.product_size = (String) productMap.get("product_size");
        this.product_color = (String) productMap.get("product_color");
        this.product_gender = (String) productMap.get("product_gender");
        this.product_category = (String) productMap.get("product_category");
        this.product_store = (String) productMap.get("product_store");
        this.bareCode = Integer.parseInt(productMap.get("bareCode").toString());

    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public String getProduct_gender() {
        return product_gender;
    }

    public void setProduct_gender(String product_gender) {
        this.product_gender = product_gender;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public int getProduct_articleNo() {
        return product_articleNo;
    }

    public void setProduct_articleNo(int product_articleNo) {
        this.product_articleNo = product_articleNo;
    }

    public int getProduct_itemNo() {
        return product_itemNo;
    }

    public void setProduct_itemNo(int product_itemNo) {
        this.product_itemNo = product_itemNo;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_store() {
        return product_store;
    }

    public void setProduct_store(String product_store) {
        this.product_store = product_store;
    }

    @Exclude
    public Map<String, Object> toMap() {

        HashMap<String, Object> result = new HashMap<>();

        result.put("image_URL", image_URL);
        result.put("product_price", product_price);
        result.put("product_articleNo", product_articleNo);
        result.put("product_itemNo", product_itemNo);
        result.put("product_name", product_name);
        result.put("product_size", product_size);
        result.put("product_color", product_color);
        result.put("product_gender", product_gender);
        result.put("product_category", product_category);
        result.put("product_store", product_store);
        result.put("bareCode", bareCode);

        return result;
    }
}
