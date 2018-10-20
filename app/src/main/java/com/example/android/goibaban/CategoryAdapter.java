package com.example.android.goibaban;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

   Context context;
   String[] tabTitles;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = new String[]{context.getString(R.string.govt), context.getString(R.string.accommodation), context.getString(R.string.attraction),
                context.getString(R.string.religion), context.getString(R.string.health), context.getString(R.string.shopping)};
    }
    /*Resources res = context.getResources();

    private String[] tabTitles = res.getStringArray(R.array.tab_titles_array);*/

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GovtOfficesListFragment();
        } else if (position == 1) {
            return new AccommodationListFragment();
        } else if (position == 2) {
            return new AttractionListFragment();
        } else if (position == 3) {
            return new ReligiousCentresListFragment();
        } else if (position == 4) {
            return new HospitalsListFragment();
        } else {
            return new ShoppingCentresListFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}