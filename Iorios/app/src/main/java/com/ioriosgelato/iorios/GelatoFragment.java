package com.ioriosgelato.iorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by Trevor0 on 1/17/2015.
 */


public class GelatoFragment extends Fragment {

      private final MainActivity a;
       public GelatoFragment(MainActivity in) {
            this.a = in;
       }

    @Override
       public View onCreateView (final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView list;
        final String [] web =
                {
                        "Biscuit Tortoni",
                        "Pistachio",
                        "Green Tea",
                        "Zuppa Inglese",
                        "Cannoli",
                        "Stracciatella",
                        "Kahlua Tiramisu",
                        "Mango Sorbetto",
                        "Hazelnut",
                        "Venezuelan Dark Chocolate",
                        "Belgian Chocolate",
                        "German Chocolate Cake",
                        "Profiterole",
                        "Spumoni",
                        "Mexican Vanila",
                        "Bacio",
                        "Passion Fruit Sorbetto",
                        "Guinness Shortbread",
                        "Mascarpone Fig",
                        "Chestnut Praline",
                        "Peanut Butter Banana",
                        "Blood Orange Sorbetto",
                        "White Chocolate Cranberry Swirl",
                        "Caramelized Pear"
                };

        final Integer [] imageId = {
                R.drawable.gel_biscuit_tortoni,
                R.drawable.gel_pistachio,
                R.drawable.gel_green_tea,
                R.drawable.gel_zuppa_inglese,
                R.drawable.gel_cannoli,
                R.drawable.gel_stracciatella,
                R.drawable.gel_kahlua_tiramisu,
                R.drawable.gel_mango_sorbetto,
                R.drawable.gel_hazelnut,
                R.drawable.gel_venezuelan_dark_chocolate,
                R.drawable.gel_belgian_chocolate,
                R.drawable.gel_german_chocolate_cake,
                R.drawable.gel_profiterole,
                R.drawable.gel_spumoni,
                R.drawable.gel_mexican_vanilla,
                R.drawable.gel_bacio,
                R.drawable.italy,
                R.drawable.italy,
                R.drawable.italy,
                R.drawable.italy,
                R.drawable.italy,
                R.drawable.italy,
                R.drawable.italy,
                R.drawable.italy
        };

        ListAdapter adapter = new ListAdapter(this.a, web, imageId);
        list = (ListView) rootView.findViewById(R.id.listview_gelato);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int row, long index) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(), DetailFragment.class);
                intent.putExtra("row", row);
                intent.putExtra("gelato_name", web[row]);
                intent.putExtra("gelato_pic", imageId[row]);
                startActivity(intent);
            }
        });

        /*listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // item click code
                //inflater.inflate(R.layout.fragment_detail, container, false);
            }
        });*/

        return rootView;
    }
}
