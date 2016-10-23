package com.example.alinbaltatescu.barcodescanner.model;

/**
 * Created by alinbaltatescu on 10/19/16.
 */
public class Product {
    private int product_image;
    private String product_name,product_price,product_size, product_color, product_gender, product_category, product_articleNo, product_itemNo, product_store;

    public Product(int product_image, String product_name, String product_price, String product_size, String product_color, String product_gender, String product_category, String product_articleNo, String product_itemNo, String product_store) {
        this.setProduct_image(product_image);
        this.setProduct_name(product_name);
        this.setProduct_price(product_price);
        this.setProduct_size(product_size);
        this.setProduct_color(product_color);
        this.setProduct_gender(product_gender);
        this.setProduct_category(product_category);
        this.setProduct_articleNo(product_articleNo);
        this.setProduct_itemNo(product_itemNo);
        this.setProduct_store(product_store);
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

    public String getProduct_articleNo() {
        return product_articleNo;
    }

    public void setProduct_articleNo(String product_articleNo) {
        this.product_articleNo = product_articleNo;
    }

    public String getProduct_itemNo() {
        return product_itemNo;
    }

    public void setProduct_itemNo(String product_itemNo) {
        this.product_itemNo = product_itemNo;
    }

    public int getProduct_image() {
        return product_image;
    }

    public void setProduct_image(int product_image) {
        this.product_image = product_image;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_store() {
        return product_store;
    }

    public void setProduct_store(String product_store) {
        this.product_store = product_store;
    }
}
