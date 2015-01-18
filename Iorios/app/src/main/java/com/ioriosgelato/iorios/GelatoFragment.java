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
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String [] listy =
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

        List<String> gelatoList = new ArrayList<String>(Arrays.asList(listy));

        ArrayAdapter<String> adaptedData =
                new ArrayAdapter<String>(getActivity(),
                        R.layout.list_item_gelato,
                        R.id.list_item_gelato_textview, gelatoList);

        ListView listview = (ListView) rootView.findViewById(R.id.listview_gelato);
        listview.setAdapter(adaptedData);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int row, long index) {
                //Intent intent = new Intent();
                //intent.setClass(this, DetailFragment.class);
                //intent.putExtra("row", row);
                //startActivity(intent);
                if(row == 1)
                {
                    System.exit(0);
                }
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

