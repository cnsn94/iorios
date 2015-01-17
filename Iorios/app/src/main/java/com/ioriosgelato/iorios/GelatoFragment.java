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
    public GelatoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String [] listy =
                {
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor",
                        "Flavor"
                };

        List<String> gelatoList = new ArrayList<String>(Arrays.asList(listy));

        ArrayAdapter<String> adaptedData =
                new ArrayAdapter<String>(getActivity(),
                        R.layout.list_item_gelato,
                        R.id.list_item_gelato_textview, gelatoList);

        ListView listview = (ListView) rootView.findViewById(R.id.listview_gelato);
        listview.setAdapter(adaptedData);

        return rootView;
    }
}

