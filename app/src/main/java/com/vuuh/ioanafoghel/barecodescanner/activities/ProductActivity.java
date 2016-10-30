package com.vuuh.ioanafoghel.barecodescanner.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.vuuh.ioanafoghel.barecodescanner.R;
import com.vuuh.ioanafoghel.barecodescanner.model.Product;
import com.vuuh.ioanafoghel.barecodescanner.service.Service;

/**
 * Created by alinbaltatescu on 10/21/16.
 */
public class ProductActivity extends AppCompatActivity{
    ImageView product_image;
    TextView product_name, product_price, product_size, product_color, product_gender, product_category, product_articleNo, product_itemNo;
    int productIndex;
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.home);

        product_image = (ImageView) findViewById(R.id.product_image_id);
        product_name = (TextView) findViewById(R.id.product_name_id);
        product_price = (TextView) findViewById(R.id.product_price_id);
        product_size = (TextView)  findViewById(R.id.product_size_id);
        product_color = (TextView) findViewById(R.id.product_color_id);
        product_gender = (TextView) findViewById(R.id.product_gender_id);
        product_category = (TextView)  findViewById(R.id.product_category);
        product_articleNo = (TextView) findViewById(R.id.product_articleNo_id);
        product_itemNo = (TextView) findViewById(R.id.product_itemNo_id);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            productIndex = extras.getInt("ProductItemIndex");
            product = Service.getProductByIndex(productIndex);

            product_name.setText(product.getProduct_name());
            product_price.setText(product.getProduct_price());
            product_size.setText(product.getProduct_size());
            product_color.setText(product.getProduct_color());
            product_gender.setText(product.getProduct_gender());
            product_category.setText(product.getProduct_category());
            product_articleNo.setText(product.getProduct_articleNo());
            product_itemNo.setText(product.getProduct_itemNo());
        }
    }
}
