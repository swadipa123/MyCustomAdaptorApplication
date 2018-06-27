package com.example.sss.mycustomadaptorapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sss.mycustomadaptorapplication.R;

import java.util.ArrayList;

public class CustomAdaptor extends BaseAdapter{
   // String [] result;
    Context context;
    //int [] imageid;
    ArrayList<Product> itemsArr;
    private static LayoutInflater inflater=null;

    public CustomAdaptor(Context activity,ArrayList<Product> itemsArr1){

        context=activity;
       itemsArr=itemsArr1;

        inflater =  (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return itemsArr.size();
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
        TextView tv;
        ImageView img;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rowview;
        rowview = inflater.inflate(R.layout.list_view,null);
        Holder holder =new Holder();
        holder.tv=(TextView) rowview.findViewById(R.id.textview );
        holder.img=(ImageView) rowview.findViewById(R.id.imageview);
        //holder.tv.setText(result[position]);
        //holder.img.setImageResource(imageid[position]);

        holder.tv.setText(itemsArr.get(position).name);
        holder.img.setImageResource(itemsArr.get(position).imgId);


        rowview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You Clicked"+itemsArr.size(), Toast.LENGTH_SHORT).show();
            }
        });



        return rowview;
    }
}
