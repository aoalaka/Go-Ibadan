package com.example.android.goibaban;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewPlaceFragment extends Fragment {


    public NewPlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_new_place, container, false);

        EditText newPlace = (EditText) rootView.findViewById(R.id.place_title);
        final String item = newPlace.getText().toString();

        EditText address = (EditText) rootView.findViewById(R.id.address_input);
        final String itemAddress = address.getText().toString();

        EditText website = (EditText) rootView.findViewById(R.id.website_input);
        final String itemWebsite = website.getText().toString();

        EditText briefDescription = (EditText) rootView.findViewById(R.id.brief_description);
        final String itemBriefDescription = briefDescription.getText().toString();

        RadioGroup category = (RadioGroup) rootView.findViewById(R.id.category);
        final int selectedCategory = category.getCheckedRadioButtonId();

        Button addBtn = (Button) rootView.findViewById(R.id.add_btn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedCategory == R.id.govt_office) {
                    Intent govtIntent = new Intent(getActivity(), GovtOfficesListActivity.class);
                    govtIntent.putExtra("item", item);
                    govtIntent.putExtra("itemAddress", itemAddress);
                    govtIntent.putExtra("itemWebsite", itemWebsite);
                    govtIntent.putExtra("itemBriefDescription", itemBriefDescription);
                    startActivity(govtIntent);
                } else if (selectedCategory == R.id.attraction) {
                    Intent attractionIntent = new Intent(getActivity(), AttractionListActivity.class);
                    attractionIntent.putExtra("item", item);
                    attractionIntent.putExtra("itemAddress", itemAddress);
                    attractionIntent.putExtra("itemWebsite", itemWebsite);
                    attractionIntent.putExtra("itemBriefDescription", itemBriefDescription);
                    startActivity(attractionIntent);
                } else if (selectedCategory == R.id.accommodation) {
                    Intent accommodationIntent = new Intent(getActivity(), AccommodationListActivity.class);
                    accommodationIntent.putExtra("item", item);
                    accommodationIntent.putExtra("itemAddress", itemAddress);
                    accommodationIntent.putExtra("itemWebsite", itemWebsite);
                    accommodationIntent.putExtra("itemBriefDescription", itemBriefDescription);
                    startActivity(accommodationIntent);
                } else if (selectedCategory == R.id.religion) {
                    Intent religionIntent = new Intent(getActivity(), ReligiousCentresListActivity.class);
                    religionIntent.putExtra("item", item);
                    religionIntent.putExtra("itemAddress", itemAddress);
                    religionIntent.putExtra("itemWebsite", itemWebsite);
                    religionIntent.putExtra("itemBriefDescription", itemBriefDescription);
                    startActivity(religionIntent);
                } else if (selectedCategory == R.id.hospital) {
                    Intent hospitalIntent = new Intent(getActivity(), HospitalsListActivity.class);
                    hospitalIntent.putExtra("item", item);
                    hospitalIntent.putExtra("itemAddress", itemAddress);
                    hospitalIntent.putExtra("itemWebsite", itemWebsite);
                    hospitalIntent.putExtra("itemBriefDescription", itemBriefDescription);
                    startActivity(hospitalIntent);
                } else if (selectedCategory == R.id.shopping){
                    Intent shoppingIntent = new Intent(getActivity(), ShoppingCentresListActivity.class);
                    shoppingIntent.putExtra("item", item);
                    shoppingIntent.putExtra("itemAddress", itemAddress);
                    shoppingIntent.putExtra("itemWebsite", itemWebsite);
                    shoppingIntent.putExtra("itemBriefDescription", itemBriefDescription);
                    startActivity(shoppingIntent);
                }

            }
        });


        // Inflate the layout for this fragment
        return rootView;
    }

}
