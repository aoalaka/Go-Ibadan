package com.example.android.goibaban;


import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingCentresListFragment extends Fragment {


    public ShoppingCentresListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);


        final ArrayList<Ibadan> ibadans = new ArrayList<Ibadan>();

        ibadans.add(new Ibadan(R.drawable.shoprite_ibadan, getString(R.string.shopping_centres).toString(), getString(R.string.shopping_centres_address).toString(), getString(R.string.shopping_centres_website).toString(), getString(R.string.shopping_centres_details).toString()));
        ibadans.add(new Ibadan(R.drawable.shoprite_ibadan, getString(R.string.shopping_centres).toString(), getString(R.string.shopping_centres_address).toString(), getString(R.string.shopping_centres_website).toString(), getString(R.string.shopping_centres_details).toString()));
        ibadans.add(new Ibadan(R.drawable.shoprite_ibadan, getString(R.string.shopping_centres).toString(), getString(R.string.shopping_centres_address).toString(), getString(R.string.shopping_centres_website).toString(), getString(R.string.shopping_centres_details).toString()));
        ibadans.add(new Ibadan(R.drawable.shoprite_ibadan, getString(R.string.shopping_centres).toString(), getString(R.string.shopping_centres_address).toString(), getString(R.string.shopping_centres_website).toString(), getString(R.string.shopping_centres_details).toString()));
        ibadans.add(new Ibadan(R.drawable.shoprite_ibadan, getString(R.string.shopping_centres).toString(), getString(R.string.shopping_centres_address).toString(), getString(R.string.shopping_centres_website).toString(), getString(R.string.shopping_centres_details).toString()));
        ibadans.add(new Ibadan(R.drawable.shoprite_ibadan, getString(R.string.shopping_centres).toString(), getString(R.string.shopping_centres_address).toString(), getString(R.string.shopping_centres_website).toString(), getString(R.string.shopping_centres_details).toString()));
        ibadans.add(new Ibadan(R.drawable.shoprite_ibadan, getString(R.string.shopping_centres).toString(), getString(R.string.shopping_centres_address).toString(), getString(R.string.shopping_centres_website).toString(), getString(R.string.shopping_centres_details).toString()));

        ListAdapter adapter = new ListAdapter(getActivity(), ibadans);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ibadan currentItem = ibadans.get(position);

                int itemPicture = currentItem.getItemPicture();
                String item = currentItem.getItem();
                String address = currentItem.getItemAddress();
                String website = currentItem.getItemWebsite();
                String details = currentItem.getItemDetails();


                Intent toAccommodationActivityIntent = new Intent(getActivity(), FullInformationActivity.class);
                toAccommodationActivityIntent.putExtra("picture", itemPicture);
                toAccommodationActivityIntent.putExtra("item", item);
                toAccommodationActivityIntent.putExtra("address", address);
                toAccommodationActivityIntent.putExtra("website", website);
                toAccommodationActivityIntent.putExtra("info", details);
                startActivity(toAccommodationActivityIntent);
            }
        });
        return rootView;
    }

}
