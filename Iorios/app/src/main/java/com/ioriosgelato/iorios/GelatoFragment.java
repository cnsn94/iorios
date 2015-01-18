package com.ioriosgelato.iorios;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
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

       public View onCreateView (final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView list;
        String [] web =
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
                        "Bacio"
                };

        Integer [] imageId = {
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
                R.drawable.gel_bacio
        };
               ListAdapter adapter = new ListAdapter(this.a, web, imageId);
               list = (ListView) rootView.findViewById(R.id.listview_gelato);
               list.setAdapter(adapter);

        return rootView;
    }
}

