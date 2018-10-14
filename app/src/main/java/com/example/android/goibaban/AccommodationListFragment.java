package com.example.android.goibaban;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccommodationListFragment extends Fragment {
//    private AccommodationListFragmentListener listener;
    private int mItemPicture;
    private String[] mItemFullDetails = new String[4];

/*
    public interface AccommodationListFragmentListener {
        void onSelectItemPicture(int itemPicture);

        void onSelectItemDetails(String[] itemFullDetails);
    }
*/

    public AccommodationListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Ibadan> ibadans = new ArrayList<Ibadan>();

        ibadans.add(new Ibadan(R.drawable.prem_hotel, getString(R.string.premier_hotel).toString(), getString(R.string.premier_hotel_address).toString(),
                getString(R.string.premier_hotel_website).toString(), getString(R.string.premier_hotel_details).toString()));
        ibadans.add(new Ibadan(R.drawable.prem_hotel, getString(R.string.premier_hotel).toString(), getString(R.string.premier_hotel_address).toString(),
                getString(R.string.premier_hotel_website).toString(), getString(R.string.premier_hotel_details).toString()));
        ibadans.add(new Ibadan(R.drawable.prem_hotel, getString(R.string.premier_hotel).toString(), getString(R.string.premier_hotel_address).toString(),
                getString(R.string.premier_hotel_website).toString(), getString(R.string.premier_hotel_details).toString()));
        ibadans.add(new Ibadan(R.drawable.prem_hotel, getString(R.string.premier_hotel).toString(), getString(R.string.premier_hotel_address).toString(),
                getString(R.string.premier_hotel_website).toString(), getString(R.string.premier_hotel_details).toString()));
        ibadans.add(new Ibadan(R.drawable.prem_hotel, getString(R.string.premier_hotel).toString(), getString(R.string.premier_hotel_address).toString(),
                getString(R.string.premier_hotel_website).toString(), getString(R.string.premier_hotel_details).toString()));
        ibadans.add(new Ibadan(R.drawable.prem_hotel, getString(R.string.premier_hotel).toString(), getString(R.string.premier_hotel_address).toString(),
                getString(R.string.premier_hotel_website).toString(), getString(R.string.premier_hotel_details).toString()));
        ibadans.add(new Ibadan(R.drawable.prem_hotel, getString(R.string.premier_hotel).toString(), getString(R.string.premier_hotel_address).toString(),
                getString(R.string.premier_hotel_website).toString(), getString(R.string.premier_hotel_details).toString()));

        ListAdapter adapter = new ListAdapter(getActivity(), ibadans);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ibadan currentItem = ibadans.get(position);

                Bundle bundle = new Bundle();
                bundle.putParcelable("Selected Item", currentItem);

                Intent intent = new Intent(getActivity().getBaseContext(),
                        DetailsActivity.class);
                intent.putExtra("Selected Item", bundle);
                getActivity().startActivity(intent);
            }
        });

        return rootView;
    }
/*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AccommodationListFragmentListener) {
            listener = (AccommodationListFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement AccommodationListFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }*/
}
