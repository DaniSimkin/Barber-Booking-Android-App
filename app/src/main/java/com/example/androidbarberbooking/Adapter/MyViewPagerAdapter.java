package com.example.androidbarberbooking.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.androidbarberbooking.Fragments.BookingStep1Fragment;
import com.example.androidbarberbooking.Fragments.BookingStep2Fragment;
import com.example.androidbarberbooking.Fragments.BookingStep3Fragment;
import com.example.androidbarberbooking.Fragments.BookingStep4Fragment;


public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return BookingStep1Fragment.getInstance();
            case 1:
                return BookingStep2Fragment.getInstance();
            case 2:
                return BookingStep3Fragment.getInstance();
            case 3:
                return BookingStep4Fragment.getInstance();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 4; // change to final before presenting
    }
}
