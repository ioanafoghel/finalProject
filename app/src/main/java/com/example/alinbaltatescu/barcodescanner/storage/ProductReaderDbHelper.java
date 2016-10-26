package com.example.alinbaltatescu.barcodescanner.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.alinbaltatescu.barcodescanner.storage.ProductReaderContract;

/**
 * Created by alinbaltatescu on 10/24/16.
 */
public class ProductReaderDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ProductReader.db";

    private static final String TEXT_TYPE = "TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE" + ProductReaderContract.ProductEntry.TABLE_NAME + "(" +
                    ProductReaderContract.ProductEntry._ID + "INTEGER PRIMARY KEY," +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_ID + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_NAME + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_PRICE + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_SIZE + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_COLOR + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_GENDER + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_CATEGORY + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_ARTICLE_NUMBER + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_ITEM_NUMBER + TEXT_TYPE + COMMA_SEP +
                    ProductReaderContract.ProductEntry.COLUMN_NAME_PRODUCT_STORE + TEXT_TYPE +COMMA_SEP +
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ProductReaderContract.ProductEntry.TABLE_NAME;

    public ProductReaderDbHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db,oldVersion,newVersion);
    }
}
