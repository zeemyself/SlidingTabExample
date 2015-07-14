package com.zeemyself.testtab.info.androidhive.tabsswipe.adapter;

/**
 * Created by Swas on 7/14/2015.
 */

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

//import com.zeemyself.testtab.info.androidhive.tabsswipe.GamesFragment;
//import com.zeemyself.testtab.info.androidhive.tabsswipe.MoviesFragment;
//import com.zeemyself.testtab.info.androidhive.tabsswipe.TopRatedFragment;


public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

//        switch (index) {
//            case 0:
//                // Top Rated fragment activity
//                return new TopRatedFragment();
//            case 1:
//                // Games fragment activity
//                return new GamesFragment();
//            case 2:
//                // Movies fragment activity
//                return new MoviesFragment();
//        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}