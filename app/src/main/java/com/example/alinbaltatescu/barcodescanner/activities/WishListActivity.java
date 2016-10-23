package com.example.alinbaltatescu.barcodescanner.activities;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alinbaltatescu.barcodescanner.R;
import com.example.alinbaltatescu.barcodescanner.adapters.WishListAdapter;
import com.example.alinbaltatescu.barcodescanner.model.Product;

import java.util.ArrayList;

/**
 * Created by alinbaltatescu on 10/19/16.
 */
public class WishListActivity extends Activity {
    final Context context = this;
    ArrayList<Product> productsArrayList = new ArrayList<Product>();
    ListView listView;
    WishListAdapter wishListAdapter;



    public static int[] product_images = {R.drawable.skirt1, R.drawable.skirt2, R.drawable.dress1, R.drawable.dress2, R.drawable.pants1, R.drawable.pants2};
    public static String [] product_prices = {"199.95", "149.95", "291.95", "519.95", "209.95", "207.95"};
    public static String [] product_stores = {"Vila", "Just Female", "French Connection", "French Connection", "Pieces", "Pieces"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wish_list_list_view);
        listView = (ListView) findViewById(R.id.wish_list_list_view);
        wishListAdapter = new WishListAdapter(this, product_images, product_prices, product_stores);
        listView.setAdapter(wishListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                Intent productIndex = new Intent(getApplicationContext(), ProductActivity.class);
                productIndex.putExtra("ProductItemIndex", position);
                startActivity(productIndex);
            }
        });

       /* listView.getOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                wishListAdapter.registerDataSetObserver(

                );
                return false;
            }
        })*/


    }

}
