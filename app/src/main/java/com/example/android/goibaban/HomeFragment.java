package com.example.android.goibaban;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.grid, container, false);


        final ArrayList<Ibadan> ibadans = new ArrayList<Ibadan>();

        ibadans.add(new Ibadan(R.drawable.govt_offices, getString(R.string.govt).toString()));
        ibadans.add(new Ibadan(R.drawable.attraction, getString(R.string.attraction).toString()));
        ibadans.add(new Ibadan(R.drawable.accommodation, getString(R.string.accommodation).toString()));
        ibadans.add(new Ibadan(R.drawable.religious_centres, getString(R.string.religion).toString()));
        ibadans.add(new Ibadan(R.drawable.hospitals, getString(R.string.health).toString()));
        ibadans.add(new Ibadan(R.drawable.shopping, getString(R.string.shopping).toString()));

        GridAdapter adapter = new GridAdapter(getActivity(), ibadans);

        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ibadan currentItem = ibadans.get(position);

//                Select a category from the items on the home page
                String category = currentItem.getCategory();
//                Check the type of category clicked and bring on the appropriate activity
                if (category == getString(R.string.govt).toString()) {
                    Intent govtIntent = new Intent(getActivity(), GovtOfficesListActivity.class);
                    startActivity(govtIntent);
                } else if (category == getString(R.string.attraction).toString()) {
                    Intent attractionIntent = new Intent(getActivity(), AttractionListActivity.class);

                    startActivity(attractionIntent);
                } else if (category == getString(R.string.accommodation).toString()) {
                    Intent accommodationIntent = new Intent(getActivity(), AccommodationListActivity.class);
                    startActivity(accommodationIntent);
                } else if (category == getString(R.string.religion).toString()) {
                    Intent religionIntent = new Intent(getActivity(), ReligiousCentresListActivity.class);
                    startActivity(religionIntent);
                } else if (category == getString(R.string.health).toString()) {
                    Intent healthIntent = new Intent(getActivity(), HospitalsListActivity.class);
                    startActivity(healthIntent);
                } else if (category == getString(R.string.shopping).toString()) {
                    Intent shoppingIntent = new Intent(getActivity(), ShoppingCentresListActivity.class);
                    startActivity(shoppingIntent);
                }
            }
        });

        return rootView;
    }

}
