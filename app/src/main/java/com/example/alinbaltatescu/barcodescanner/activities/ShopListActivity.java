package com.example.alinbaltatescu.barcodescanner.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alinbaltatescu.barcodescanner.R;
import com.example.alinbaltatescu.barcodescanner.adapters.ShopListAdapter;

/**
 * Created by alinbaltatescu on 10/20/16.
 */
public class ShopListActivity extends Activity{
    ListView listView;
    Context context = this;
    ShopListAdapter shopListAdapter;

    public static String [] store_name = {"Vero Moda", "Triumph", "Tiger of Sweden", "Tommy Hilfiger", "Only", "Pieces"};
    public static String [] store_address = {"Bruun's Galleri, M. P. Bruuns Gade 25, 8000 Aarhus C", "Frederiksgade 1, 8000 Aarhus C", "Store Torv 16, 8000 Aarhus C", " Bruun's Galleri, M. P. Bruuns Gade 25, 8000 Aarhus C", " Bruun's Galleri, M. P. Bruuns Gade 25, 8000 Aarhus C", "Søndergade 10, 8000 Aarhus C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_list_list_view);

        context = this;

        listView = (ListView) findViewById(R.id.shop_list_list_view);
        shopListAdapter = new ShopListAdapter(this, store_name, store_address);
        listView.setAdapter(shopListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                Intent productIndex = new Intent(getApplicationContext(), ProductsActivity.class);
                productIndex.putExtra("ProductItemIndex", position);
                startActivity(productIndex);
            }
        });



    }

}
