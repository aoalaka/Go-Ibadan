package com.example.android.goibaban;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HospitalsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Ibadan> ibadans = new ArrayList<Ibadan>();

        ibadans.add(new Ibadan(R.drawable.uch_ibadan, getString(R.string.uch).toString(), getString(R.string.uch_address).toString(), getString(R.string.uch_website).toString(), getString(R.string.uch_details).toString()));
        ibadans.add(new Ibadan(R.drawable.uch_ibadan, getString(R.string.uch).toString(), getString(R.string.uch_address).toString(), getString(R.string.uch_website).toString(), getString(R.string.uch_details).toString()));
        ibadans.add(new Ibadan(R.drawable.uch_ibadan, getString(R.string.uch).toString(), getString(R.string.uch_address).toString(), getString(R.string.uch_website).toString(), getString(R.string.uch_details).toString()));
        ibadans.add(new Ibadan(R.drawable.uch_ibadan, getString(R.string.uch).toString(), getString(R.string.uch_address).toString(), getString(R.string.uch_website).toString(), getString(R.string.uch_details).toString()));
        ibadans.add(new Ibadan(R.drawable.uch_ibadan, getString(R.string.uch).toString(), getString(R.string.uch_address).toString(), getString(R.string.uch_website).toString(), getString(R.string.uch_details).toString()));
        ibadans.add(new Ibadan(R.drawable.uch_ibadan, getString(R.string.uch).toString(), getString(R.string.uch_address).toString(), getString(R.string.uch_website).toString(), getString(R.string.uch_details).toString()));
        ibadans.add(new Ibadan(R.drawable.uch_ibadan, getString(R.string.uch).toString(), getString(R.string.uch_address).toString(), getString(R.string.uch_website).toString(), getString(R.string.uch_details).toString()));

        ListAdapter adapter = new ListAdapter(this, ibadans);

        ListView listView = (ListView) findViewById(R.id.list_view);

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


                Intent toAccommodationActivityIntent = new Intent(HospitalsListActivity.this, FullInformationActivity.class);
                toAccommodationActivityIntent.putExtra("picture", itemPicture);
                toAccommodationActivityIntent.putExtra("item", item);
                toAccommodationActivityIntent.putExtra("address", address);
                toAccommodationActivityIntent.putExtra("website", website);
                toAccommodationActivityIntent.putExtra("info", details);
                startActivity(toAccommodationActivityIntent);
            }
        });

    }
}

