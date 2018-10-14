package com.example.android.goibaban;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsActivityFragment extends Fragment {
    private ImageView selectedItemImageView;
    private TextView selectedItemName;
    private TextView selectedItemAddress;
    private TextView selectedItemWebsite;
    private JustifyTextView selectedItemInfo;
    Ibadan selectedItem;


    public DetailsActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();

        if (bundle != null) {
            selectedItem = bundle.getParcelable("Selected Item");
        }

        final View rootView = inflater.inflate(R.layout.fragment_details, container, false);


        selectedItemImageView = rootView.findViewById(R.id.item_picture);
        selectedItemImageView.setImageResource(selectedItem.getItemPicture());

        selectedItemName = rootView.findViewById(R.id.item);
        selectedItemName.setText(selectedItem.getItem());

        selectedItemAddress = rootView.findViewById(R.id.address);
        selectedItemAddress.setText(selectedItem.getItemAddress());

        selectedItemWebsite = rootView.findViewById(R.id.website);
        selectedItemWebsite.setText(selectedItem.getItemWebsite());


        selectedItemInfo = rootView.findViewById(R.id.info);
        selectedItemInfo.setText(selectedItem.getItemDetails());

        return rootView;
    }

   /* public void updateSelectedItemPicture(int itemPicture) {
        selectedItemImageView.setImageResource(itemPicture);
    }

    public void updateSelectedItemDetails(String[] itemFullDetails) {
        selectedItemName.setText(itemFullDetails[0]);
        selectedItemAddress.setText(itemFullDetails[1]);
        selectedItemWebsite.setText(itemFullDetails[2]);
        selectedItemInfo.setText(itemFullDetails[3]);
    }*/
}
