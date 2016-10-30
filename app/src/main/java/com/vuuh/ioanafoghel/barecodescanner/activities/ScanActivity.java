package com.vuuh.ioanafoghel.barecodescanner.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.vuuh.ioanafoghel.barecodescanner.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.vuuh.ioanafoghel.barecodescanner.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ScanActivity extends AppCompatActivity {
    private Button scanBtn;
    private Button wishBtn;
    private Button shopBtn;
    private Button writeToDatabase;
    private Button readToDatabase;
    //root of the json tree
    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mProductsRef = mRootRef.child("products");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        scanBtn = (Button) findViewById(R.id.scan_btn_id);
        wishBtn = (Button) findViewById(R.id.wish_list_btn_id);
        shopBtn = (Button) findViewById(R.id.shops_list_btn_id);
        writeToDatabase = (Button) findViewById(R.id.write_database_btn_id);
        readToDatabase = (Button) findViewById(R.id.read_database_btn_id);

        final Activity scan_activity = this;
        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntentIntegrator integrator = new IntentIntegrator(scan_activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.PRODUCT_CODE_TYPES);
                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(true);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();
            }
        });

        wishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScanActivity.this, WishListActivity.class);
                startActivity(intent);
                finish();
            }
        });

        shopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScanActivity.this, ShopListActivity.class);
                startActivity(intent);
                finish();
            }
        });

        writeToDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String imageURL = "http://d2zus9315f01od.cloudfront.net/cache/images/products/33150/55812/actress-oversize-t-shirt.cb0c8f745aad.jpg";
                Product prod1 = new Product(imageURL, "test1", 45, "M", "blue", "male", "jeans", 12, 50, "Stylepit",123456);

                String key = mProductsRef.push().getKey();
                Map<String, Object> productValues = prod1.toMap();
                Map<String, Object> childUpdates = new HashMap<>();
                childUpdates.put(key, productValues);
                mProductsRef.updateChildren(childUpdates);
            }
        });

        readToDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            } else {
                Intent resultIntent = new Intent(getApplicationContext(), ProductActivity.class);
                startActivity(resultIntent);

                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Query allProducts = mRootRef.child("products");
        final List<Product> productList = new ArrayList<>();
        allProducts.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot productSnapshot : dataSnapshot.getChildren()) {
                    HashMap<String, Object> productrMap = (HashMap<String, Object>) productSnapshot.getValue();
                    productList.add(new Product(productrMap));
                }

                Log.i("Product list count", productList.size() + "");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}