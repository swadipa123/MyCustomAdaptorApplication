package com.example.sss.mycustomadaptorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    ArrayList<Product> itemArray= new ArrayList<Product>();

   // public int [] imageList={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
//public String [] nameList= {"iphone x", "iphone 6", "iphone 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int item=0;item<10;item++)
        {
           itemArray.add(new Product("iphone x",R.mipmap.ic_launcher));

        }

        lv = (ListView) findViewById(R.id.list_view);
        lv.setAdapter(new CustomAdaptor(this,itemArray));

    }
}
