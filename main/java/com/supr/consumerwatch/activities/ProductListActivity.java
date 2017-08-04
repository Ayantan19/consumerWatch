package com.supr.consumerwatch.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.supr.consumerwatch.R;
import com.supr.consumerwatch.models.Product;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {

    ListView lv;

    private static ArrayList<Product> DUMMY_PRODUCTS;

    static {
           DUMMY_PRODUCTS.add(new Product(50, "Masala"));
           DUMMY_PRODUCTS.add(new Product(100, "Ghee"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        lv = (ListView) findViewById(R.id.productList);

        ArrayAdapter<Product> arrayAdapter = new ArrayAdapter<Product>(this,android.R.layout.simple_list_item_1,DUMMY_PRODUCTS);
        lv.setAdapter(arrayAdapter);
    }
}
