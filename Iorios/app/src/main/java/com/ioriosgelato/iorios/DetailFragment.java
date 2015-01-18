package com.ioriosgelato.iorios;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Trevor0 on 1/17/2015.
 */
public class DetailFragment extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail);
        Intent intent = getIntent();
        int position = intent.getIntExtra("row", 0);
       String title = intent.getStringExtra("gelato_name");
        int rightIm = intent.getIntExtra("gelato_pic", 0);

        TextView text = (TextView) findViewById(R.id.gelato_name);
        text.setText(title);

        ImageView imagey = (ImageView) findViewById(R.id.detail_icon);
        imagey.setImageResource(rightIm);
        /*Context context = getApplicationContext();
        CharSequence text = title;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();*/

        //ImageView imageView = (ImageView)rightIm;
    }

}
