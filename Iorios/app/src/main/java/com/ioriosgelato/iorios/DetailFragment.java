package com.ioriosgelato.iorios;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Trevor0 on 1/17/2015.
 */
public class DetailFragment extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);


    }

}
