package com.example.android.goibaban;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.goibaban.Ibadan;
import com.example.android.goibaban.R;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<Ibadan> {
    public GridAdapter(Activity context, ArrayList<Ibadan> ibadans) {
        super(context, 0, ibadans);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;

        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        Ibadan currentMenu = getItem(position);

        TextView homeMenuTextView = gridItemView.findViewById(R.id.home_menu_text_view);
        homeMenuTextView.setText(currentMenu.getCategory());

        ImageView homeMenuImageView = gridItemView.findViewById(R.id.home_menu_image_view);
        homeMenuImageView.setImageResource(currentMenu.getCategoryImage());

        return gridItemView;
    }
}
