package com.example.alinbaltatescu.barcodescanner.storage;

import android.provider.BaseColumns;

/**
 * Created by alinbaltatescu on 10/24/16.
 */
public class ProductReaderContract {

    public ProductReaderContract() {}

    public static abstract class ProductEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "product";
        public static final String COLUMN_NAME_PRODUCT_ID = "productid";
        public static final String COLUMN_NAME_PRODUCT_NAME = "product_name";
        public static final String COLUMN_NAME_PRODUCT_PRICE = "product_price";
        public static final String COLUMN_NAME_PRODUCT_SIZE = "product_size";
        public static final String COLUMN_NAME_PRODUCT_COLOR = "product_color";
        public static final String COLUMN_NAME_PRODUCT_GENDER = "product_gender";
        public static final String COLUMN_NAME_PRODUCT_CATEGORY = "product_category";
        public static final String COLUMN_NAME_PRODUCT_ARTICLE_NUMBER = "product_articleNo";
        public static final String COLUMN_NAME_PRODUCT_ITEM_NUMBER = "product_itemNo";
        public static final String COLUMN_NAME_PRODUCT_STORE = "product_store";
        public static final String COLUMN_NAME_NULLABLE = "";
    }

}
