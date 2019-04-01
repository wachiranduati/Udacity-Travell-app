package android.example.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TouringCategoriesAdapter extends FragmentPagerAdapter {



    public TouringCategoriesAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BirdSeeingFragment();
        } else {
            return new NatureTrailsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 2;
    }

}