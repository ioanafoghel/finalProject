package com.example.alinbaltatescu.barcodescanner.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alinbaltatescu.barcodescanner.R;
import com.example.alinbaltatescu.barcodescanner.activities.WishListActivity;

/**
 * Created by alinbaltatescu on 10/19/16.
 */
public class WishListAdapter extends BaseAdapter {
    public int [] imageIds;
    public String[] prices;
    public String[] stores;
    public Context context;


    private static LayoutInflater inflater = null;

    public WishListAdapter(WishListActivity wishListActivity, int[] product_images, String[] product_prices, String[] product_stores)
    {
        imageIds = product_images;
        prices = product_prices;
        stores = product_stores;
        context = wishListActivity;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imageIds.length;
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
        ImageView image;
        TextView price;
        TextView store;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.wish_list_row, null);
        holder.image = (ImageView) rowView.findViewById(R.id.image_view_id);
        holder.price = (TextView) rowView.findViewById(R.id.price_view_id);
        holder.store = (TextView) rowView.findViewById(R.id.store_view_id);

        holder.image.setImageResource(imageIds[position]);
        holder.price.setText(prices[position]);
        holder.store.setText(stores[position]);

       /* rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You clicked " + stores[position], Toast.LENGTH_LONG).show();
            }
        });*/
        return rowView;
    }




    /*  public WishListAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class DataHandler
    {
        ImageView product_image;
        TextView product_price;
        TextView product_store;
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;
        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.wish_list_row, parent, false);
            handler = new DataHandler();
            handler.product_image = (ImageView) row.findViewById(R.id.image_view_id);
            handler.product_price = (TextView) row.findViewById(R.id.price_view_id);
            handler.product_store = (TextView) row.findViewById(R.id.store_view_id);
            row.setTag(handler);
        }
        else
        {
            handler = (DataHandler) row.getTag();
        }
        Product product;
        product = (Product) this.getItem(position);
        handler.product_image.setImageResource(product.getProduct_image());
        handler.product_price.setText(product.getProduct_price());
        handler.product_store.setText(product.getProduct_store());

        return row;
    }*/
}
