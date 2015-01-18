package com.ioriosgelato.iorios;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;
import java.util.List;
public class ListAdapter extends ArrayAdapter {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public ListAdapter(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.list_item_gelato, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_item_gelato, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.list_item_gelato_textview);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.list_item_icon);
        txtTitle.setText(web[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }

}
/**
 * Created by Cher on 1/17/2015.
 */
