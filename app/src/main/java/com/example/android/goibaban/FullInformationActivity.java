package com.example.android.goibaban;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class FullInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_information);

        final int pictureBroughtByIntent = getIntent().getExtras().getInt("picture");
        final String itemBroughtByIntent = getIntent().getExtras().getString("item");
        final String addressBroughtByIntent = getIntent().getExtras().getString("address");
        final String websiteBroughtByIntent = getIntent().getExtras().getString("website");
        final String infoBroughtByIntent = getIntent().getExtras().getString("info");

        ImageView picture = (ImageView) findViewById(R.id.item_picture);
        picture.setImageResource(pictureBroughtByIntent);

        TextView item = (TextView) findViewById(R.id.item);
        item.setText(itemBroughtByIntent);

        TextView address = (TextView) findViewById(R.id.address);
        address.setText(addressBroughtByIntent);

        TextView website = (TextView) findViewById(R.id.website);
        website.setText(websiteBroughtByIntent);

        JustifyTextView info = (JustifyTextView) findViewById(R.id.info);
        info.setText(infoBroughtByIntent);
    }
}
