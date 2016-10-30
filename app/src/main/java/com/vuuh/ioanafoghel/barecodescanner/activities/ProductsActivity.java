package com.vuuh.ioanafoghel.barecodescanner.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.vuuh.ioanafoghel.barecodescanner.R;
import com.vuuh.ioanafoghel.barecodescanner.adapters.ProductsAdapter;

/**
 * Created by alinbaltatescu on 10/21/16.
 */
public class ProductsActivity extends Activity{
    public ListView listView;
    ProductsAdapter productsAdapter;


    public static int[] products_images = {R.drawable.skirt1, R.drawable.skirt2, R.drawable.dress1, R.drawable.dress2, R.drawable.pants1, R.drawable.pants2};
    public static String [] products_prices = {"199.95", "149.95", "291.95", "519.95", "209.95", "207.95"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_list_view);

        listView = (ListView) findViewById(R.id.wish_list_list_view);
        listView.setAdapter(new ProductsAdapter(this, products_images, products_prices));
    }
}
