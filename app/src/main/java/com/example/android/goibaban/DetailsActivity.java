package com.example.android.goibaban;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

       /* Intent intent = getIntent();
        Ibadan selectedItem = (Ibadan) intent.getParcelableExtra("Selected Item");*/

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Ibadan selectedItem = bundle.getParcelable("Selected Item");

        // 1. Parse the object to the fragment as a bundle;
        DetailsActivityFragment detailsActivityFragment = new DetailsActivityFragment();

        Bundle bundleToFragment = new Bundle();
        bundle.putParcelable("Selected Item", selectedItem);
        detailsActivityFragment.setArguments(bundleToFragment);
        // 2. Commit the fragment.
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment, detailsActivityFragment).commit();
    }
}
