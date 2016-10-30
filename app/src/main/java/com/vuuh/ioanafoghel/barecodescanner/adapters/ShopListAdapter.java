package com.vuuh.ioanafoghel.barecodescanner.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.vuuh.ioanafoghel.barecodescanner.R;
import com.vuuh.ioanafoghel.barecodescanner.activities.ShopListActivity;

/**
 * Created by alinbaltatescu on 10/20/16.
 */
public class ShopListAdapter extends BaseAdapter{
    String[] stores;
    String[] addresses;
    Context context;


    private static LayoutInflater inflater = null;

    public ShopListAdapter(ShopListActivity shopListActivity, String[] shop_list_stores, String[] shop_list_addresses)
    {
        stores = shop_list_stores;
        addresses = shop_list_addresses;
        context = shopListActivity;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return stores.length;
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
        TextView store;
        TextView address;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.shop_list_row, null);
        holder.store = (TextView) rowView.findViewById(R.id.store_name_id);
        holder.address = (TextView) rowView.findViewById(R.id.store_address_id);

        holder.store.setText(stores[position]);
        holder.address.setText(addresses[position]);
        /*rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You clicked " + stores[position], Toast.LENGTH_LONG).show();
            }
        });*/
        return rowView;
    }
}
