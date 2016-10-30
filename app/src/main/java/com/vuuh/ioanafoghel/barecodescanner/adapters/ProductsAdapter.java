package com.vuuh.ioanafoghel.barecodescanner.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vuuh.ioanafoghel.barecodescanner.R;
import com.vuuh.ioanafoghel.barecodescanner.activities.ProductsActivity;


public class ProductsAdapter extends BaseAdapter{
    int[] products;
    String[] prices;
    Context context;


    private static LayoutInflater inflater = null;

    public ProductsAdapter(ProductsActivity productsActivities, int[] products_images, String[] products_prices)
    {
        products = products_images;
        prices = products_prices;
        context = productsActivities;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return products.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {
        ImageView product;
        TextView price;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.products_row, null);
        holder.product = (ImageView) rowView.findViewById(R.id.image_view_id);
        holder.price = (TextView) rowView.findViewById(R.id.price_view_id);

        holder.product.setImageResource(products[position]);
        holder.price.setText(prices[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You clicked " + products[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}
