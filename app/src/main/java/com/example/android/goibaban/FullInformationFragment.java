package com.example.android.goibaban;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class FullInformationFragment extends Fragment {


    public FullInformationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_full_information, container, false);

        /*final int pictureBroughtByIntent = getIntent().getExtras().getInt("picture");
        final String itemBroughtByIntent = getIntent().getExtras().getString("item");
        final String addressBroughtByIntent = getIntent().getExtras().getString("address");
        final String websiteBroughtByIntent = getIntent().getExtras().getString("website");
        final String infoBroughtByIntent = getIntent().getExtras().getString("info");*/

        /*ImageView picture = (ImageView) rootView.findViewById(R.id.item_picture);
        picture.setImageResource(pictureBroughtByIntent);

        TextView item = (TextView) rootView.findViewById(R.id.item);
        item.setText(itemBroughtByIntent);

        TextView address = (TextView) rootView.findViewById(R.id.address);
        address.setText(addressBroughtByIntent);

        TextView website = (TextView) rootView.findViewById(R.id.website);
        website.setText(websiteBroughtByIntent);

        JustifyTextView info = (JustifyTextView) rootView.findViewById(R.id.info);
        info.setText(infoBroughtByIntent);*/

        return rootView;
    }

}
